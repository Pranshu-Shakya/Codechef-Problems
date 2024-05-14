// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ATM2
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int people = sc.nextInt();
		    int amount = sc.nextInt();
		    int[] withdraws = new int[people];
		    for(int j = 0; j<people; j++)
		    withdraws[j] = sc.nextInt();
		    String s = "";
		    for(int j = 0; j<people; j++) {
		        if(amount >= withdraws[j]) {
		            amount = amount - withdraws[j];
		            s = s + 1;
		        }
		        else 
		        s = s + 0;
		    }
		    System.out.println(s);
		}
	}
}
