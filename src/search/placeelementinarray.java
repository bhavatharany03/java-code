package search;

public class placeelementinarray {
    public static int element(int[] arr,int i,int target) {
        if (i >= arr.length) {
            return -1;
        } else if (arr[i] == target) {
            return i;
        }
        for(i=0;i<arr.length;i++){
            while(arr[i]!=target){
                if(arr[i]>target && arr[i+1]<target){
                    return i;
                }
            }
        }

        return element(arr,i+1,target);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        int res = element(arr,0,target);
        System.out.println(res);
    }
}
