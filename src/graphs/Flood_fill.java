package graphs;
import java.util.*;
public class Flood_fill {

    public static class Pair {
        int row;
        int col;

        Pair(int r, int c) {
            this.row = r;
            this.col = c;
        }
    }

    public static int[][] floodfill(int[][] grid, int sr, int sc, int color) {
        int n=grid.length;
        int m=grid[0].length;

        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&  grid[nrow][ncol] == sc) {
                    q.add(new Pair(nrow, ncol));
                    grid[nrow][ncol] = color;
                }
            }
        }
        return grid;

    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {0, 0, 0}};
        int n=grid.length;
        int m=grid[0].length;

        int[][]res=floodfill(grid, 1, 0, 2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
