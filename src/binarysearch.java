public class binarysearch {
    public static int search(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, target, low, mid - 1);
        } else {
            return search(arr, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int low = 0;
        int high = arr.length - 1;

        int res = search(arr, target, low, high);

        if (res != -1) {
            System.out.println("Target found at index: " + res);
        } else {
            System.out.println("Target not found");
        }
    }
}

