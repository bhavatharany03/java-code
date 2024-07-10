package recursion;

public class knapsack01 {
    public static int data(int[] wt,int[] price,int idx,int cap){
        if(idx==wt.length || cap==0){
            return 0;
        }
        int exclude = data(wt,price,idx+1,cap);
        int include =0;
        if(cap>=wt[idx]){
            include = data(wt,price,idx+1,cap-wt[idx])+price[idx];
        }
        int ans = Math.max(exclude,include);
        return ans;

    }

    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
       int[] price = {1,4,5,7};
        int cap=7;
        System.out.print(data(wt,price,0,cap));
    }

}
