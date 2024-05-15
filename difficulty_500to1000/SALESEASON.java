// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SALESEASON
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int amt = sc.nextInt();
		    if(amt <= 100)
		    System.out.println(amt);
		    else if((amt > 100) && (amt <= 1000))
		    System.out.println(amt - 25);
		    else if((amt > 1000) && (amt <= 5000))
		    System.out.println(amt - 100);
		    else if(amt > 5000)
		    System.out.println(amt - 500);
		}
	}
}
