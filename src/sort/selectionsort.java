package sort;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {7,6,5};
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int a = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[a]) {
                    a = j;
                }
            }
            int temp = arr[a];
            arr[a] = arr[i];
            arr[i] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}