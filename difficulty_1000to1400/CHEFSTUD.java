// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CHEFSTUD
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
            String s = sc.next();
            int len = s.length();
            int count = 0;
            for(int i = 0; i<len-1; ) {
                if(s.charAt(i) == '*') {
                    i++;
                    continue;
                }
                if((s.charAt(i) == '<') && (s.charAt(i+1) =='>')) {
                    count++;
                    i+=2;
                } else {
                    i++;
                }
                
            }
            System.out.println(count);
        }
	}
}
