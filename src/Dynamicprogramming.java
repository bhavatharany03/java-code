public class Dynamicprogramming {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int prev1 = 0; // max money up to the house before the previous house
        int prev2 = 0; // max money up to the previous house
        for (int num : nums) {
            int temp = prev2;
            prev2 = Math.max(prev2, prev1 + num);
            prev1 = temp;
        }
        return prev2;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 1, 3, 100};
        System.out.println(rob(nums));
    }
}

