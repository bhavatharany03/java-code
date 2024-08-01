package array;

public class Jumpgame1 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        boolean ans = function(arr);
        System.out.print(ans);
    }
    public static boolean function(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex = Math.max(maxIndex,i+arr[i]);
        }
        return true;
    }
}
