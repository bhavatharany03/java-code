package Leetcode75;

public class LongestSubarrayofOnes {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int prev = 0;
        int cur = 0;
        for(int a:nums){
            if(a==1){
                cur++;
            }
            else{
                ans = Math.max(ans,cur+prev);
                prev = cur;
                cur = 0;
            }
        }
        ans = Math.max(ans,cur+prev);
        return ans == nums.length ? ans-1:ans;

    }
}
