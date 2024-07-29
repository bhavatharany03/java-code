package Leetcode75;
import java.util.ArrayList;
import java.util.List;
public class GreatestNoofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>();
        int maxcandies = 0;
        for(int candy:candies){
            if(candy>maxcandies){
                maxcandies=candy;
            }
        }
        for(int candy:candies){
            list.add(candy+extraCandies>=maxcandies);
        }
        return list;
    }
}
