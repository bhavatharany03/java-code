package array;

public class ArraysortedorNot {
    public static void main(String[] args) {
        int[] arr = {23,45,65,76,87};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print("False");
            }

        }
        System.out.print("True");
    }
}
