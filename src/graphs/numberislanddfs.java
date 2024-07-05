package graphs;

public class numberislanddfs {
        static int n, m;

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
                        dfs(i, j, grid, vis);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }


        public static void dfs(int row, int col, int[][] grid, boolean[][] vis) {

            int[] dRow = {-1, 0, 1, 0};
            int[] dCol = {0, 1, 0, -1};


            vis[row][col] = true;


            for (int k = 0; k < 4; k++) {
                int nRow = row + dRow[k];
                int nCol = col + dCol[k];


                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !vis[nRow][nCol] && grid[nRow][nCol] == 1) {
                    dfs(nRow, nCol, grid, vis);
                }
            }
        }
    }

