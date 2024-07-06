package sort;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {90,10,50,30,60,20,25};
        int[] res = sort(arr,0,arr.length-1);
        for(int val:res){
            System.out.print(val+" ");
        }

    }
    public static int[] sort(int[] arr,int low,int high){
        if(low==high){
            int[] br = new int[1];
            br[0] = arr[low];
            return br;
        }
        int mid = (low+high)/2;
        int[] fh = sort(arr,low,mid);
        int[] sh = sort(arr,mid+1,high);
        int[] res = mergesortarray(fh,sh);
        return res;
    }
    public static int[] mergesortarray(int[] one,int[] two){
        int[] merged = new int[one.length+ two.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< one.length && j< two.length){
            if(one[i]<two[j]){
                merged[k]=one[i];
                k++;
                i++;
            }
            else{
                merged[k]=two[j];
                k++;
                j++;
            }
        }
        if(j== two.length){
            while(i< one.length){
                merged[k]=one[i];
                i++;
                k++;
            }
        }
        return merged;
    }
}

