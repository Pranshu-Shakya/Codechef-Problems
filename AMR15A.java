import java.util.*;
import java.lang.*;
import java.io.*;

class Mahasena
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		int even=0, odd=0;
		for(int i = 0; i<n; i++) {
		    w[i] = sc.nextInt();
		    if(w[i] % 2 == 0)
		    even++;
		    else 
		    odd++;
		}
		if(even > odd) 
		System.out.println("READY FOR BATTLE");
		else
		System.out.println("NOT READY");
	}
}
