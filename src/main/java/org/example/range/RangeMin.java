//package org.example.range;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RangeMin {
    static int MAX = 1000000001;
    static int DIV_SIZE;
    static int[] newArr;
    private static void createDiv(int[] arr) {

        DIV_SIZE = (int)Math.sqrt(arr.length);

        int blocks = (arr.length + DIV_SIZE - 1) / DIV_SIZE;

        newArr = new int[blocks];

        Arrays.fill(newArr, MAX);

        for (int i = 0; i < arr.length; i++) {

            int block = i / DIV_SIZE;

            newArr[block] = Math.min(newArr[block], arr[i]);
        }
    }
//    private static void createDiv(int[] arr) {
//        DIV_SIZE = (int)Math.ceil(Math.sqrt(arr.length));
//        newArr = new int[DIV_SIZE];
//        Arrays.fill(newArr, MAX);
//        int divInd =-1;
//        for (int i = 0; i< arr.length; ++i) {
//            if ( i % DIV_SIZE == 0) {
//                divInd++;
//            }
//            newArr[divInd] = Math.min(arr[i], newArr[divInd]);
//        }
//    }

    private static int calculateMin(int l, int r, int[] arr) {
        if (l == r) return arr[l-1];
        int min = MAX;
        while (l %DIV_SIZE!=0 && l <r && l !=0) {
            min = Math.min(min, arr[l-1]);l++;
//            System.out.print(" "+min+"+");
        }
        while (l+DIV_SIZE-1 <=r) {
            min = Math.min(min, newArr[(l-1)/DIV_SIZE]);
            l+= DIV_SIZE;
//            System.out.print("+ "+min+" +");
        }

        while (l <=r) {

            min = Math.min(min, arr[l-1]);l++;
//            System.out.print("+"+min);
        }
//        System.out.println();

    return min;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        for (int i = 0; i< m; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        createDiv(arr);
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<n; ++i) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            sb.append(calculateMin(l, r, arr)+"\n");

        }
        System.out.println(sb);
    }




}
