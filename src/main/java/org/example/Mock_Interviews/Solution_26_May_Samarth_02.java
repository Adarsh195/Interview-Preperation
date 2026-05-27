package org.example.Mock_Interviews;

import java.util.*;

public class Solution_26_May_Samarth_02 {
   static List<Integer> list;
    public static void addNum(int i) {
        list.add(i);
        Collections.sort(list);

    }
    public static float findMedian() {
        int n = list.size();
        if (n%2 == 0) {
//            System.out.println(list.get(0)/2.0);
            return (float)(((float)list.get(n/2-1)+(float)list.get(n/2))/2.0f);
        } else {
            return list.get(n/2);
        }
    }
//    void addNum(int num) - Adds an integer num to the data structure.double
//    findMedian() - Returns the median of all elements so far.
    public static void main(String[] args) {

//        Solution_26_May_Samarth_02 s = new Solution_26_May_Samarth_02();
//        s.list = new ArrayList<>();
        list = new ArrayList<>();
        int[] arr = {111, 1,7, 2, 1, 4, 56, 4, 3};
        int x =1;
        for (int i: arr) {
//            list.add(i);
            addNum(i);
            if(x++%3 == 0) System.out.println(findMedian() +" "+ list.size());
        }
//        int[] ans = s.maxInKSlidingWindow(arr, k);
//        for (int i: ans)
//            System.out.println(i);

    }
}
