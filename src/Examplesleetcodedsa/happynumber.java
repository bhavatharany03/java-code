package Examplesleetcodedsa;

import java.util.*;


public class happynumber {
    public static void main(String[] args) {
        int a = 19;
        boolean ans = isnum(a);
        System.out.println(ans);
    }
    public static boolean isnum(int a){
        Set<Integer> s = new HashSet<>();
        while(a!=0 && !s.contains(a)){
            s.add(a);
            a = square(a);
        }
        if(a==1){
            return true;
        }
        return false;
     }
     public static int square(int a){
        int sum=0;
        while(a>0){
            int num = a%10;
            sum+=num*num;
            a/=10;
        }
        return sum;
     }
}
//    public static boolean isHappy(int n) {
//        Set<Integer> s = new HashSet<>();
//
//        while (n != 1 && !s.contains(n)) {
//            s.add(n);
//            n = getSumOfSquares(n);
//        }
//
//        if(n == 1){
//            return true;
//        }
//        return false;
//    }
//
//    private static int getSumOfSquares(int n) {
//        int sum = 0;
//        while (n > 0) {
//            int num = n % 10;
//            sum += num * num;
//            n /= 10;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int a = 61;
//        boolean ans = isHappy(a);
//        System.out.print(ans);
//    }
//}

