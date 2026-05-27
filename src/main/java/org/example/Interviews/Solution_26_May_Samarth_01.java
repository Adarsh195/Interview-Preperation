package org.example.Interviews;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_26_May_Samarth_01 {
    public int[] maxInKSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> queue = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        int i = 0, l = 0, r = 0;
        while (l<=r && r<n) {
//            111, 1,7, 2, 1, 4, 56, 4, 3

                while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[r]) {
                    queue.removeLast();
                }
                queue.addLast(r);
//            System.out.println(queue.peekFirst()+"  -");
                if (r-l+1 == k) {

                    ans[i++] = arr[queue.peekFirst()];
                    l++;
                }
                if (!queue.isEmpty() && queue.peekFirst() < l) {
                    queue.pollFirst();
                }
            r++;
//            System.out.println(r+"  0");
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution_26_May_Samarth_01 s = new Solution_26_May_Samarth_01();
        int[] arr = {111, 1,7, 2, 1, 4, 56, 4, 3};
        int k = 3;
        int[] ans = s.maxInKSlidingWindow(arr, k);
        for (int i: ans)
            System.out.println(i);

    }
}
