// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CANDY123
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int sumA = 0, sumB = 0, l=1, bb=2, limak=0, bob=0;
		    while(sumA <= a) {
		        sumA += l;
		        l += 2;
		        limak++;
		    }
		    while(sumB <= b) {
		        sumB += bb;
		        bb += 2;
		        bob++;
		    }
		    if(limak > bob)
		    System.out.println("Limak");
		    else
		    System.out.println("Bob");
		    t--;
		}
	}
}
