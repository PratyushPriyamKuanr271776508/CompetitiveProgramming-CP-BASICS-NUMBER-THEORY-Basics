import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       final int MOD = (int) 1e9 + 7;
       
       long[] dp = new long[(int) 1e5 + 1];
       dp[0] = 2;
       dp[1] = 3;
       long temp = 6;
       for (int i = 2; i <= (int) 1e5; i++) {
           dp[i] = (temp + 1) % MOD;
           temp = (temp * dp[i]) % MOD;
       }
       
       int t = sc.nextInt();
       while (t-- > 0) {
           int n = sc.nextInt();
           System.out.println(dp[n]);
       }
       
       sc.close();
   }
}