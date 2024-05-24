// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ENCMSG
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		    int n = sc.nextInt();
		    String s = sc.next();
		    String ns = "";
		    String nns = "";
		    if(n % 2 == 0)
		    for(int i = 0; i<n; i+=2)
		    ns+=s.charAt(i+1)+""+s.charAt(i);
		    else {
		        for(int i = 0; i<n-1; i+=2)
		        ns+=s.charAt(i+1)+""+s.charAt(i);
		        ns+=s.charAt(n-1);
		    }
		    for(int i = 0; i<n; i++) {
		        char ch = ns.charAt(i);
		        int chara = (ch + 26) - 2 * (ch - 97) - 1;
		      //  System.out.print(chara + " ");
		        nns+= (char)chara;
		    }
		    System.out.println(nns);
		    t--;
		}
	}
}
