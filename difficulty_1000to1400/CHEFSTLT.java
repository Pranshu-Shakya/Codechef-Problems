// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CHEFSTLT
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		    String s1 = sc.next();
		    String s2 = sc.next();
		    int countQ = 0, count = 0;
		    int len = s1.length();
		    for(int i = 0; i<len; i++) {
		        char a = s1.charAt(i);
		        char b = s2.charAt(i);
		        if(a != b ){
		            if(a == '?' || b == '?')
		            countQ++;
		            else
		            count++;
		        }
		        else if(a == '?' && b == '?') {
		            countQ++;
		        }
		    }
		    System.out.println(count + " " + (countQ+count));
		    t--;
		}
	}
}
