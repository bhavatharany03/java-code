package Slidingwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class indexofsubarraysum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int k = 2;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = data(arr,sum,n,k);
        System.out.print(result);

    }
    public static ArrayList<Integer> data(int arr[], int sum, int n, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int wsum = 0;
//        int msum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum+=arr[i];
        }
        if(wsum==sum){
            ans.add(0);
            ans.add(k-1);
        }
        for(int i=k;i<n;i++) {
            wsum = wsum - arr[i - k] + arr[i];
//            msum = Math.max(msum, wsum);
            if (wsum == sum) {
                ans.add(i-k+1);
                ans.add(i);
            }
        }
        return ans;
    }
}
