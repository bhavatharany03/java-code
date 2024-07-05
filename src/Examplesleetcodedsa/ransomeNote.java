package Examplesleetcodedsa;

import java.util.HashMap;

public class ransomeNote {
    public static boolean note(String ransom,String magazine){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++) {
            char ch = magazine.charAt(i);
            if (!map.containsKey(ch)) {
                    map.put(ch,1);
                } else {
                    map.put(ch, map.get(ch) + 1);

                }
            }
        for(int i=0;i<ransom.length();i++){
            char ch = ransom.charAt(i);
            if(map.containsKey(ch) && map.get(ch) >0 ){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        String ransom = "aab",magazine = "abjab";
        System.out.println(note(ransom,magazine));
    }
}
