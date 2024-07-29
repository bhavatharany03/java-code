package Leetcode75;

public class MergeStringAltenately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=word1.length()-1 || i<=word2.length()-1;i++){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}

