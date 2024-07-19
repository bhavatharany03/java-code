package Slidingwindow;

import java.util.HashMap;

public class containsduplicate_II {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 3;
        boolean result = data(nums,k);
        System.out.print(result);
    }
    public static boolean data(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                int pastIndex = map.get(nums[i]);
                if(Math.abs(pastIndex-i)<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
