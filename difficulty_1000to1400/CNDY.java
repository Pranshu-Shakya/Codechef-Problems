// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CNDY
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
		    int len = sc.nextInt();
		    int arrlen = 2*len;
		    int arr[] = new int[arrlen];
		    for(int i = 0; i<arrlen; i++)
		    arr[i] = sc.nextInt();
		    int count = 0;
		    boolean terminate = false;
		    for(int i = 0; i<arrlen; i++) {
		        count = 0;
		        for(int j = i; j<arrlen; j++) {
		            if(arr[i] == arr[j]) {
		                count++;
		                if(count == 3) {
		                    terminate = true;
		                    break;
		                }
		            }
		        }
		        if(terminate == true)
		        break;
		    }
		    if(count == 3)
		    System.out.println("No");
		    else
		    System.out.println("Yes");
		    n--;
		}
	}
}
