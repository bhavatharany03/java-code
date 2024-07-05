package sort;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {23,43,56,565,232,12,4,2,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
//    public static void main(String[] args) {
////        int temp = 0;
//        int[] arr = {34, 54, 65, 76, 45, 75};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int k = 0; k < arr.length; k++) {
//            System.out.print(arr[k] + " ");
//        }
//    }
//}






















