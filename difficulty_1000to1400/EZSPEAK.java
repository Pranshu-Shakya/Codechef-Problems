// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/EZSPEAK
import java.util.*;

class EZSPEAK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int len = sc.nextInt();
		    String s = sc.next();
		    if(len < 4) {
		    System.out.println("YES");
		    continue;
		    }
		    int count = 0;
		    for(int j = 0; j<len; j++) {
		        char ch = s.charAt(j);
		        if(count == 4)
		        break;
		        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		        count = 0;
		        else 
		        count++;
		    }
		        if(count == 4)
		        System.out.println("NO");
		        else
		        System.out.println("YES");
		}
        sc.close();
	}
}

