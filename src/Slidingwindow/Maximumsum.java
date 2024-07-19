package Slidingwindow;

public class Maximumsum {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,7};
        int k=3;
        int result = data(a,k);
        System.out.print(result);
    }
    public static int data(int[] a,int k){
        int wsum = 0;
        int msum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum+=a[i];
        }
        for(int i=k;i<a.length;i++){
            wsum = wsum - a[i-k] +a[i];
            msum = Math.max(msum,wsum);
        }
        return msum;
    }
}
