//package org.example.range;
//
//import java.util.Scanner;
//
//public class RangeSum {
//    public static void main(String[] args) {
////        8 4
////        3 2 4 5 1 1 5 3
////        2 4
////        5 6
////        1 8
////        3 3
//        Scanner sc = new Scanner(System.in);
//
//        int m = sc.nextInt(), n = sc.nextInt();
//        sc.nextLine();
//
//        int[] arr = new int[m];
//        long[] prefix = new long[m];
//
//        for (int i = 0; i< m; ++i) {
//            arr[i] = sc.nextInt();
//        }
//        sc.nextLine();
//        int[][] query = new int[n][2];
//        for (int i = 0; i< n; ++i) {
//            query[i][0] = sc.nextInt();
//            query[i][1] = sc.nextInt();
//            sc.nextLine();
//        }
//        prefix[0] = arr[0];
//        for (int i = 1; i< m; ++i) {
//            prefix[i] = arr[i]+ prefix[i-1];
//        }
//        long[] ans = new long[n];
//        int x = 0;
//        for (int[] i: query) {
//            if (i[0]-2 >= 0)
//                ans[x++] =  prefix[i[1]-1] - prefix[i[0]-2];
//            else
//                ans[x++] = prefix[i[1]-1] - 0;
//        }
//        for (long i: ans) {
//            System.out.println(i);
//        }
//    }
//}
import java.io.*;
import java.util.*;

public class RangeSum {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        StringTokenizer st;

        // first line
        st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] prefix = new long[m + 1];

        // array line
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= m; i++) {
            prefix[i] = prefix[i - 1]
                    + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        // queries
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb.append(prefix[r] - prefix[l - 1])
                    .append('\n');
        }

        System.out.print(sb);
    }
}