//package org.example.range;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubarraySumsI {
    public static void main(String[] args) throws IOException {
//        5 7
//        2 4 1 2 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i< n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i!=0) arr[i] += arr[i-1];
//            if (arr[i] == target) count++;
        }
        if (arr[0] == target) count++;
        for (int i = n-1; i>0; --i) {
            int r = i-1, l =  0, mid = 0;
            if (arr[i] == target) {
                count++;
                continue;
            }
            while (l<=r) {
                mid = l +(r-l)/2;
                if (arr[i] - arr[mid] == target) {
                    count++;
                    break;
                }
                if (arr[i] - arr[mid] < target) {
                    r = mid-1;
                }
                if (arr[i] - arr[mid] > target) {
                    l = mid+1;
                }

            }
        }
        System.out.println(count);


    }
}
