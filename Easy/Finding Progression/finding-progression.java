import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while (t-- > 0) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();

           if (b - a == c - b) {
               System.out.println(2L * c - b);
           } else {
               System.out.println(1L * c * b / a);
           }

       }
       sc.close();
   }
}