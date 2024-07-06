package recursion;

import java.util.Scanner;

public class climbingstairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.print(ways(s));
    }
    static int ways(int n){
        return fib(n+1);
    }
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

}

