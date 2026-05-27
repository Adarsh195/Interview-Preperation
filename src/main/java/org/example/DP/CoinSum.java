//package org.example.DP;

import java.util.Arrays;
import java.util.Scanner;

public class CoinSum {
    static int maxAns;
    static int[][] dp;
    static int coinSum(int[] arr, int target, int i) {
        int m = dp.length;

        if (target == 0) {
            return 0;
        }
        if (target < 0 || i>= arr.length) {
            return Integer.MAX_VALUE-1;
        }
        if (dp[target][i] !=-1) return dp[target][i];
        return dp[target][i] = Math.min(1+ coinSum(arr, target-arr[i], i), coinSum(arr, target, i+1));
    }
    public static void main(String[] args) {

        maxAns = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n,target;
        n = sc.nextInt();
//        sc.nextLine();
        target = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        dp = new int[target+1][arr.length];
        for (int[] i: dp) {
            Arrays.fill(i, -1);
        }
        int ans = coinSum(arr, target, 0);

        System.out.println(ans == Integer.MAX_VALUE-1? -1:ans);
    }
}
