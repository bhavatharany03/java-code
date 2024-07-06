package recursion;

public class mazepath {
    static int n=2;
    public static int maze(int row,int col){
        if(row==n && col==n){
            return 1;
        }
        if(row>n || col>n){
            return 0;
        }
        int left = maze(row,col+1);
        int right = maze(row+1,col);
        int ans = left+right;

        return ans;
    }

    public static void main(String[] args) {
//        maze(0,0);
        System.out.print(maze(0,0));


    }
}
