package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> l = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for (int i=0; i<n; ++i) {
            int x = sc.nextInt();
            l.add(x);
        }
        while(!l.isEmpty()) {
//            int x = 0;
            for (int i= l.size()-1;i>=0;--i) {
                ans.add("S"+(i));
                l.set(i, l.get(i)-1);
                if (l.get(i) == 0) {
                    l.remove(i);
//                    break;
                }
            }
        }
        int f = 1;
        for (int i = 1; i< ans.size(); ++i) {
            if (ans.get(i).equals(ans.get(i-1))) {
                System.out.println(new ArrayList<>());
                f = 0;
                break;
            }
        }
        if (f == 1) {
            for (String s: ans)
                System.out.print(s+" ");
        }
    }
}
