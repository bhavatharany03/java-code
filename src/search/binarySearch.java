package search;

public class binarySearch {
    public static int Search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid = low + high / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                low = mid + 1;
            else if (arr[mid] < target)
                high = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int ind = Search(arr,target);
        if(ind==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at index:"+ind);
    }
}
