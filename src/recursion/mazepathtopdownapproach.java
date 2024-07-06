package recursion;

public class mazepathtopdownapproach {
    static int n = 2;
//    static int[][] strg = new int[n+1][n+1];

    public static int path(int row, int col,int[][] strg) {
        if (row == n && col == n) {
            return 1;
        }
        if (row > n || col > n) {
            return 0;
        }
        if (strg[row][col] != 0) {
            return strg[row][col];
        }
        int left = path(row, col + 1,strg);
        int right = path(row + 1, col,strg);
        strg[n][n] = left + right;
        return strg[row][col];

    }

    public static void main(String[] args) {
        int ans = path(0,0,new int[n+1][n+1]);
        System.out.println(ans);
    }
}

