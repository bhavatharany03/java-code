package Leetcode75;

import java.util.Arrays;

public class MaxNumberofKsumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        // ArrayList<Integer> ans = new ArrayList<>();

        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<right){
            int sum = nums[left]+nums[right];

            if(sum==k){
                count++;
                left++;
                right--;
            }
            else if(sum<k){
                left++;
            }else{
                right--;
            }
        }

        return count;
    }
}
