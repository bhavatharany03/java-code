package Examplesleetcodedsa;

import java.util.HashSet;
import java.util.Set;

public class containduplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean ans = duplicate(nums);
        System.out.println(ans);
    }
    public static boolean duplicate(int[] nums){
        Set<Integer> s = new HashSet<>();
        for(int num:nums){
            if(s.contains(num)){
                return true;
            }
            s.add(num);

        }
        return false;
    }
}
