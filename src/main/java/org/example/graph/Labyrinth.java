//package org.example.graph;
//
//import java.util.*;
//
//public class Labyrinth {
//    static Map<int[], Character> map;
//
//    public static void main(String[] args) {
//        map = new HashMap<>();
//        map.put(new int[]{0, 1}, 'R');
//        map.put(new int[]{0, -1}, 'L');
//        map.put(new int[]{1, 0}, 'D');
//        map.put(new int[]{-1, 0}, 'U');
//        Scanner sc = new Scanner(System.in);
//        int m, n;
//        m = sc.nextInt();
////        sc.nextLine();
//        n = sc.nextInt();
//        sc.nextLine();
//        char[][] arr = new char[m][n];
//
//        for (int i = 0; i < m; ++i) {
//
//            String s = sc.nextLine();
//
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = s.charAt(j);
//            }
//        }
//        String ans = "";
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 'A') {
////                    ans++;
//                    ans = bfs(arr, i, j);
//                }
//            }
//        }
//        System.out.println(ans);
//
//    }
//    private static boolean isValid(char[][] arr, int i, int j) {
//        int m = arr.length, n = arr[0].length;
//
//        if (i >=0 && j >=0 && i<m && j< n && arr[i][j] =='.'|| arr[i][j] =='B') return true;
//        return false;
//    }
//    private static String bfs(char[][] arr, int i, int j) {
//        if (arr[i][j] == 'B') {
//            return "";
//        }
//        Queue<int[]> que = new LinkedList<>();
//        que.add(new int[]{i, j});
//        while (!que.isEmpty()) {
//            int[] c = que.poll();
//            int a = c[0], b = c[1];
//            int[] move = {0, 1, -1};
//            for (int x : move) {
//                for (int y : move) {
//                    if (Math.abs(x) != Math.abs(y)) {
//                        if (isValid(arr, a + x, b + y)) {
//                            map.get(new int[]{x, y})
//                        }
//                    }
//                }
//            }
//
//        }
//    return "";
//    }
//}
