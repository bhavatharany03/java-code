package graphs;

public class floodfilldfs {
        public static void main(String[] args) {
            int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
            int sc = 1, sr = 1, color = 2;
            floodFill(grid, sr, sc, color);
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int[][] floodFill(int[][] grid, int sr, int sc, int color) {
            if (grid[sr][sc] != color) {
                flood_fill_dfs(grid, sr, sc, grid[sr][sc], color);
            }
            return grid;
        }

        public static void flood_fill_dfs(int[][] grid, int row, int col, int in, int color) {
            if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != in) {
                return;
            }
            grid[row][col] = color;
            flood_fill_dfs(grid, row + 1, col, in, color);    //down
            flood_fill_dfs(grid, row - 1, col, in, color);    //up
            flood_fill_dfs(grid, row, col + 1, in, color);    //right
            flood_fill_dfs(grid, row, col - 1, in, color);    //left

        }
}
