// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/BREAKSTICK
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    if(n % 2 == 0)
		    System.out.println("YES");
		    else {
		        if(x % 2 == 0)
		        System.out.println("NO");
		        else
		        System.out.println("YES");
		    }
		}
	}
}
