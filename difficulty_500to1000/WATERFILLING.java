// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WATERFILLING
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int b1 = sc.nextInt();
		    int b2 = sc.nextInt();
		    int b3 = sc.nextInt();
		    if((b1+b2+b3) < 2)
		    System.out.println("Water filling time");
		    else
		    System.out.println("Not now");
		}
	}
}
