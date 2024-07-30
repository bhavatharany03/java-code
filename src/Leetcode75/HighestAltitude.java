package Leetcode75;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int ans = 0;
        int altitude = 0;

        for(int i=0;i<gain.length;i++){
            altitude += gain[i];
            ans = Math.max(ans,altitude);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int res = largestAltitude(gain);
        System.out.print(res);

    }
}
