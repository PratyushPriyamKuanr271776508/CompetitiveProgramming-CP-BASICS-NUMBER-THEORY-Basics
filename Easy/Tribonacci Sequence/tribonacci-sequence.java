import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       final int MOD = (int) 1e9 + 7;
       int t = sc.nextInt();
       while (t-- > 0) {
           int n = sc.nextInt();

           long[] dp = new long[n + 1];
           dp[1] = sc.nextInt();
           dp[2] = sc.nextInt();
           dp[3] = sc.nextInt();

           for (int i = 4; i <= n; i++) {
               dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
           }

           System.out.println(dp[n]);
       }
       sc.close();
   }
}