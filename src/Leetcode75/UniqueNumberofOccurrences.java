package Leetcode75;

public class UniqueNumberofOccurrences {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        int ans =count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                ++count;
            }
            if(isvowel(s.charAt(i-k))){
                --count;
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
    private static boolean isvowel(char c){
        return c=='a'|| c=='e'|| c=='i'||c=='o'|| c=='u';
    }
}
