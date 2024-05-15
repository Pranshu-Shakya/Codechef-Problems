// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/EXAMTIME
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tie = 0;
		for(int i = 0; i<n; i++) {
		    int dragon[] = new int[3];
		    int sloth[] = new int[3];
		    int totalD = 0;
		    int totalS = 0;
		    for(int j = 0; j<3; j++) {
		        dragon[j] = sc.nextInt();
		        totalD += dragon[j];
		    }
		    for(int j = 0; j<3; j++) {
		        sloth[j] = sc.nextInt();
		        totalS +=sloth[j];
		    }
		    if(totalD > totalS)
		    System.out.println("Dragon");
		    else if(totalS > totalD)
		    System.out.println("Sloth");
		    else {
		        for(int j = 0; j<3; j++) {
		            if(dragon[j] > sloth[j]) {
		                System.out.println("Dragon");
		                break;
		            }
		            else if(dragon[j] < sloth[j]) {
		                System.out.println("Sloth");
		                break;
		            }
		            else if(dragon[j] == sloth[j]) {
                        if(j == 2)
                        System.out.println("Tie");
		            }
		        }
		    }
		}
	}
}
