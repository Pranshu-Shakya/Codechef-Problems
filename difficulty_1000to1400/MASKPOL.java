// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/MASKPOL
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
            int a = sc.nextInt();
            if(a <= (n-a))
            System.out.println(a);
            else
            System.out.println(n-a);
        }
	}
}
