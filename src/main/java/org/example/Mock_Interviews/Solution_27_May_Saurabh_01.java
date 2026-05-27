package org.example.Mock_Interviews;

import java.util.List;

public class Solution_27_May_Saurabh_01 {
    static Integer[] dp;
   static List<Integer> list;
//    public static boolean isValid(int[] arr, int i, int prev) {
//       if (i < arr.length && (arr[i] >= 0 || prev >= 0) ) return true;
//       return false;
//     }
    public static int findMax(int[] arr, int i) {
        if (dp[i] != null) return dp[i];
        int ansa = -1, ansb = -1, n = arr.length;
        if (i > arr.length-1) return Integer.MIN_VALUE;
        if (i == arr.length-1) return arr[i];
        if (i+1 < n && (arr[i+1] >= 0 || arr[i] >= 0)) {
          ansa =  findMax(arr, i+1);
        }
        if (i+2 < n && (arr[i+2] >= 0 || arr[i] >= 0)) {
            ansb = findMax(arr, i+2);
        }
        if (ansa <0 && ansb < 0) return dp[i] =  -1;
        return dp[i] = arr[i] + Math.max(ansa, ansb);
    }

    public static void main(String[] args) {

        int[] arr = {-1, -1, -2, -3, 9};
        dp = new Integer[arr.length+1];
        int a = findMax(arr, 0);
        dp = new Integer[arr.length+1];
        int b = findMax(arr, 1);
        System.out.println(Math.max(a,b));

//        System.out.println(Integer.MAX_VALUE+1);
    }
}
