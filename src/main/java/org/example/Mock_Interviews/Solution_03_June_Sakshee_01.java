package org.example.Mock_Interviews;

import java.util.Arrays;

public class Solution_03_June_Sakshee_01 {
    public boolean studentCount (int[] arr, int k, int value) {
        int sum = 0;
        for (int i: arr) {
            sum += (i/value);
            if (sum >= k) return true;
        }
        return false;
    }
    public int maxCandies(int[] arr, int k) {
        int n = arr.length, max = 0;

       for (int i: arr) max = Math.max (max,i);
       int l = 1, r = max, mid = 1, ans = 0;

       while (l <= r) {
           mid = l + (r-l)/2;
           if (studentCount(arr, k, mid)) {
               l = mid +1;
               ans = mid;
           } else {
               r = mid -1;
           }

       }
        return ans;

    }

    public static void main(String[] args) {

        Solution_03_June_Sakshee_01 s = new Solution_03_June_Sakshee_01();
        int[] arr = {5,8,6,3};
        int k = 5;
        System.out.println(s.maxCandies(arr, k));
    }
}
