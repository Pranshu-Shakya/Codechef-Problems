// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/COUNTP
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            long sum = 0;
            boolean hasOdd = false;
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if(a[i] % 2 != 0) {
                    hasOdd = true;
                }
            }
            if(sum % 2 == 0 && hasOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
