import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();
       while (t-- > 0) {
           int n = sc.nextInt() - 1;
           int res = 0;
           while (n > 0) {
               res += n / 5;
               n /= 5;
           }
           System.out.println(res);
       }

       sc.close();
   }
}