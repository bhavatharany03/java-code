package Leetcode75;

public class MaxAverageofSubArray_I {
    public double findMaxAverage(int[] nums, int k) {
        double wsum = 0;
        // double mavg = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum+=nums[i];
            // double avg = wsum/k;
        }
        double avg = wsum/k;
        double mavg = wsum/k;
        if(k==nums.length){
            return avg;
        }

        for(int i=k;i<nums.length;i++){
            wsum = wsum - nums[i-k] + nums[i];
            avg = wsum/k;
            mavg = Math.max(mavg,avg);
        }
        return mavg;
    }
}
