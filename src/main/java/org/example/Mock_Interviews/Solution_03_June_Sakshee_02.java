package org.example.Mock_Interviews;
//StockSpanner() Initializes the object of the class.
//int next(int price) Returns the span of the stock's price given that today's price is price.

import java.util.*;

class StockSpanner {
    List<Integer> l;
    Stack<Integer> stk;

    StockSpanner() {
        l = new ArrayList<>();
        stk = new Stack<>();
    }
    int next(int price) {
        int span = 0;
        l.add(price);
        int n = l.size()-1;
        int x = 0;
        if (stk.isEmpty()) stk.push(0);

            while (!stk.isEmpty() && l.get(stk.peek()) <= price) {
                stk.pop();
            }
        if (!stk.isEmpty() &&  l.get(stk.peek()) > price ) {
            x = stk.peek();
            span = n-x;
//            stk.push(n);
        } else {
            span = 1;
        }
            stk.push(n);



        return span;
    }
}

public class Solution_03_June_Sakshee_02 {

    public static void main(String[] args) {
        StockSpanner s = new StockSpanner();
        int[] arr = {100,80,60,70,60,75,85};//[100], [80], [60], [70], [60], [75], [85]
        for (int i: arr) {
            System.out.println(s.next(i));
        }
    }
}
