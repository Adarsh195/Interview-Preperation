package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class NEW {
    public static boolean isValid(int i, int j, int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (i>= 0 && j >= 0 && i< m && j < n && grid[i][j] == 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        grid = [
// [2,2,0,1],
// [2,3,2,1],
// [0,1,2,3],
// [1,2,2,2]
//]
//        O(M*N)
//        Output
//        3
                int[][] grid = {{2,1,1,0}
                                ,{1,3,1,1}
                                , {0,1,1,3}
                                , {1,1,2,1}};
                int m = grid.length, n = grid[0].length;

                Queue<int[]> queue = new LinkedList<>();

                for(int i = 0; i < m; ++i) {
                    for (int j = 0; j<n; ++j) {
                        if (grid[i][j] == 2) {
                            queue.offer(new int[]{i, j});
                        }
                    }
                }
                int count = -1;
                while (!queue.isEmpty()) {
                    int x = queue.size();
//                    System.out.print("---"+x+" ---");
                    count++;

                    while (--x>=0) {
                        int[] ind = queue.poll();
                        int[] p = {0, 1, -1};
                        for (int i: p) {
                            for (int j: p) {
                                if (Math.abs(i)!=Math.abs(j)) {
                                    if (isValid(ind[0]+i, ind[1]+j, grid)) {
                                        grid[ind[0]+i][ind[1]+j] = 2;
                                        queue.offer(new int[]{ind[0]+i, ind[1]+j});
                                    }
                                }
                            }
                        }
                    }
                }
        boolean f = false;
        for(int i = 0; i < m; ++i) {

            for (int j = 0; j<n; ++j) {
//                System.out.print(grid[i][j]+" ");
                if (grid[i][j] == 1) {

                    System.out.println("-1");
                    f = true;
                    break;
                }
            }
//            System.out.println();
            if (f) break;
        }
        if (!f) System.out.println(count);

    }
}
