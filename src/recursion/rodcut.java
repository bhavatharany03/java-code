package recursion;

public class rodcut {
    public static void main(String[] args) {
        int[] price  = {0,3,5,8,9,10,17,17,20};
        System.out.println(rodcut(price,price.length-1));
    }
    public static int rodcut(int[] price,int n){
        int  max = price[n];
        int left  = 1;
        int right = n-1;
        while(left<=right){
            int fp = rodcut(price,left);
            int rp = rodcut(price,right);
            int tot = fp+rp;
            if(tot>max)
                max= tot;
            left++;
            right--;
        }
        return max;
    }
}
