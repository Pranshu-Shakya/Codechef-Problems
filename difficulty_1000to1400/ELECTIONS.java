// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ELECTIONS
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char ch ='A';
		while(t>0) {
		    int[] votes = new int[3];
		    int count = 0;
		    for(int i = 0; i<3; i++) {
		        votes[i] = sc.nextInt();
		        if(votes[i] > 50) {
		            count++;
		            ch = (char)(i+65);
		        }
		    }
		    if(count == 1)
		    System.out.println(ch);
		    else
		    System.out.println("NOTA");
		    t--;
		}
	}
}
