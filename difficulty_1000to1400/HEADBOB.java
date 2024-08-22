// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/HEADBOB
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
            int count = 0;
            for(int i=0; i<n; i++) {
                if(s.charAt(i) == 'I') {
                    System.out.println("INDIAN");
                    break;
                }
                else if(s.charAt(i) == 'Y') {
                    System.out.println("NOT INDIAN");
                    break;
                }
                else 
                count++;
            }
            if(count == n)
            System.out.println("NOT SURE");
        }
	}
}
