package Examplesleetcodedsa;

import java.util.Scanner;

public class climbingstairs {

        static int countWays(int n, int dp[])
        {
            if (n <= 1)
                return dp[n] = 1;

            if (dp[n] != -1) {
                return dp[n];
            }
            dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp);
            return dp[n];
        }


        public static void main(String[] args)
        {
            int n = 77;
            int[] dp = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                dp[i] = -1;
            }
            System.out.println(countWays(n, dp));
        }
    }




