// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CREDCOINS
import java.util.*;

class CREDCOINS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    System.out.println((x*y)/100);
		}
	}
}
