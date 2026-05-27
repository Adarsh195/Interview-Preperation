package org.example;

import java.util.ArrayList;
import java.util.List;

public class Interview_Amazon_thirdParty {
//
public static void main(String[] args) {
    int[] arr =  {1, 2};
    List<Integer> l = new ArrayList<>();
    for (int i: arr) l.add(i);
    int i = -1, x = 1;

    while (l.size()!=1) {
        int n= l.size();

        l.remove((i+3)%n);
        for (Integer t: l) System.out.print(t+" ");
        System.out.println();
        i = (i+3-1)%n;
    }
    System.out.println(l.get(0));

}


}
