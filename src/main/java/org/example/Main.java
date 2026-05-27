package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        events = [4, 2, -5, 1, -2, 3, 6, -1]
//        K = 3
//        Output:
//            [-5, -5, -5, -2, -2, -1]
//        TIME : O(N)
//        SPACE: O(1)
        int[] events = {4, 2, 5, -1, 2, 3, 6, 1};

        int k = 3, n = events.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> currFailedIndex = new ArrayDeque<>();
        int i = 0, j = 0, c = 0;
        while (i < n && j < n) {
            if (events[j] <0) {
                currFailedIndex.addLast(j);
            }

            if (j-i+1 == k) {
                if (currFailedIndex.isEmpty())
                    ans[c++] = 1;
                else
                    ans[c++] = events[currFailedIndex.getFirst()];
                i++;
                if (!currFailedIndex.isEmpty() && currFailedIndex.getFirst() < i) currFailedIndex.pollFirst();
            }


            j++;

        }
       for (int x: ans) {
           System.out.print(x<0? x+" ":"Ok" +" ");
       }
    }
}