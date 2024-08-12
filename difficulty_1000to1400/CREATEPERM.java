// https://www.codechef.com/problems/CREATEPERM
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            int a = 1;
            for (int i = 0; i<n; i += 2) {
                array[i] = a;
                a++;
            } 
            for(int i = 1; i<n; i+=2) {
                array[i] = a;
                a++;
            }
            for(int num : array)
            System.out.print(num + " ");
            System.out.println();
        }
	}
}
