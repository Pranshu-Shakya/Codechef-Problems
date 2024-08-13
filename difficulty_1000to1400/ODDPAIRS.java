// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ODDPAIRS?tab=statement
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long odd = (n + 1) / 2;
            long even = n / 2; 
            System.out.println(2 * odd * even);
        }
        sc.close();
    }
}
