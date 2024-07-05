package search;

public class linearsearchrecursion {
    public static int Search(int[] arr, int target,int i) {
        if (i>=arr.length)
            return -1;
        else if (arr[i] == target) {
            return i;
        }
        return Search(arr,target,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,23,12};
        int target = 7;
        int ind = Search(arr,target,0);
        if(ind==-1)
            System.out.println("element not found");
        else
            System.out.println("Element found at index:"+ind);
    }
}
