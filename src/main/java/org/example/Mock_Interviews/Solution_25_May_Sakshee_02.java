package org.example.Mock_Interviews;

import java.util.*;

public class Solution_25_May_Sakshee_02 {
    public int totalMinimumSum(int n) {

        return 0;
    }

    public static void main(String[] args) {
        Solution_25_May_Sakshee_02 s = new Solution_25_May_Sakshee_02();
        int n = 4, k = 3, candidate = 4;
        int[] arr = {17,12,10,2,7,2,11,20,8};
//        int[] brr = new int[]{arr};
//        Arrays.sort(brr);

        List<Integer> l = new ArrayList<>(Arrays.stream(arr).boxed().toList());
//        List<Integer> m = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
//        List<Integer> ans = new ArrayList<>();
        int ans = 0;
        while (k > 0 && candidate*2 < l.size()) {
            int xx = candidate;
            int i = 0, j = l.size()-1;
            while ( xx >0 ) {
                if (i < l.size())
                    left.offer(l.get(i));
                if(j >=0)
                    right.offer(l.get(j));
                i++;j--;
            }
            int p = left.peek() <= right.peek()? left.poll(): right.poll();
            l.remove(Integer.valueOf(p));
            ans+=p;
            System.out.println(" --"+l+"--- ");
            k--;
        }
        Collections.sort(l);
        while (k > 0) {
            ans+= l.remove(0);

            System.out.println(" --"+l+"--- ");
            k--;
        }

//        for (Integer i : ans) {
//            aaa+=i;
//        }

        System.out.println(ans);

//        int[][] a= new int[arr.length][2];
//        for (int i = 0; i< 6; ++i) {
//            a[i][0] = arr[i];
//        a[i][1] = i;
//        }
//        Arrays.sort(a, (int[] x, int[] y) -> x[0]-y[0] );
//
//        for (int i = 0; i< 6; ++i)
//            System.out.println(s.totalMinimumSum(a[0][0]) +"c "+a[i][1]);
//    }
    }
}
