package org.example.Mock_Interviews;

public class Solution_25_May_Sakshee_01 {
    public int countOfDifferentDominoCombination(int n) {
        int[] two = new int[100000001];
        int[] three = new int[1000001];
        two[0] = 1;
        two[1] = 2;
        for (int i = 2; i<two.length; ++i) {
            two[i] = two[i-1]*2-1;
        }
        three[0] = 0;
        three[1] = 0;
        three[2] = 2;
        for (int i = 3; i<three.length; ++i) {
            three[i] = three[i-1]*2 +2;
        }
        return two[n-1]+three[n-1];
    }
    public static void main(String[] args) {
        Solution_25_May_Sakshee_01 s = new Solution_25_May_Sakshee_01();
        for (int i = 1; i< 19; ++i)
            System.out.println(s.countOfDifferentDominoCombination(i));
    }
}
