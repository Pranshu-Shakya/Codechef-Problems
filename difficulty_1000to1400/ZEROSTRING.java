// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ZEROSTRING
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int one = 0, zero = 0;
            for(int i = 0; i<n; i++) {
                if(s.charAt(i) == '1')
                one++;
                else
                zero++;
            }
            if(zero >= one) {
                System.out.println(n - zero);
            } else {
                System.out.println(n - one + 1);
            }
        }
	}
}
