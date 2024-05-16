// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ADJSUMPAR
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int len = sc.nextInt();
		    int b[] = new int[len];
		    int sum = 0;
		    for(int j = 0; j<len; j++) {
		        b[j] = sc.nextInt();
		        sum += b[j];
		    }
		    if(sum % 2 == 0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
