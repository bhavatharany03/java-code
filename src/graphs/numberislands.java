package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class numberislands {
    static int i, j;
    static int n, m = 3;

    public static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 1, 0, 1}
        };

        n = grid.length;
        m = grid[0].length;

        int count = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {
                    bfs(i, j, grid, vis);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void bfs(int row, int col, int[][] grid, boolean[][] vis) {

        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row, col));
        vis[row][col] = true;


        while (!q.isEmpty()) {
            Pair current = q.poll();
            int curRow = current.row;
            int curCol = current.col;


            for (int k = 0; k < 4; k++) {
                int nRow = curRow + dRow[k];
                int nCol = curCol + dCol[k];


                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !vis[nRow][nCol] && grid[nRow][nCol] == 1) {
                    q.add(new Pair(nRow, nCol));
                    vis[nRow][nCol] = true;
                }
            }
        }
    }
}

