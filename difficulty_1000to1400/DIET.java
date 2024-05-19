// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/DIET
import java.util.*;

class Diet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
		    int N = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[N];
		    for(int i = 0; i<N; i++)
		    arr[i] = sc.nextInt();
		    int count = 0, rem = 0;
		    for(int i = 0; i<N; i++) {
		        if((arr[i]+rem) < k) {
		            System.out.println("NO " + (i+1));
		            break;
		        }
		        else {
		            rem = (arr[i]+rem) - k;
		            count++;
		        }
            }
            if(count == N)
            System.out.println("YES");
            n--;
		}
	}
}
