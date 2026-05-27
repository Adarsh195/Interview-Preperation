//package org.example.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountNumberOfRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m = sc.nextInt();
//        sc.nextLine();
        n = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[m][n];

        for (int i = 0; i<m; ++i) {

            String s = sc.nextLine();

            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '.') {
                    ans++;
                    bfs(arr, i, j);
                }
            }
        }
        System.out.println(ans);

        }
    private static boolean isValid(char[][] arr, int i, int j) {
        int m = arr.length, n = arr[0].length;

        if (i >=0 && j >=0 && i<m && j< n && arr[i][j] =='.') return true;
        return false;
    }
    private static void bfs(char[][] arr, int i, int j) {
        Queue<int[]> que = new LinkedList<>();
        arr[i][j] = '#';
        int[] move = {0, 1, -1};
        que.add(new int[]{i, j});
        while (!que.isEmpty()) {
            int[] p = que.poll();
            int a = p[0], b = p[1];
            for (int x : move) {
                for (int y : move) {
                    if (Math.abs(x) != Math.abs(y)) {
                        if (isValid(arr, a + x, b + y)) {
                            arr[a+x][b+y] = '#';
                            que.add(new int[]{a+x, b+y});
//                            bfs(arr, a + x, b + y);
                        }
                    }
                }
            }
        }
    }
}
