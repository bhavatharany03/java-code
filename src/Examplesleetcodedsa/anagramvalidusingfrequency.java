package Examplesleetcodedsa;

public class anagramvalidusingfrequency {
    public static void main(String[] args) {
        String s = "nagaram";
        String s2 = "anagram";
        boolean ans = isvalid(s,s2);
        System.out.println(ans);
    }
    public static boolean isvalid(String s,String s2){
        if(s.length()!=s2.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int num:freq){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
