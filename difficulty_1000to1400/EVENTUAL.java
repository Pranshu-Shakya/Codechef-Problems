// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/EVENTUAL
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            String str = sc.next();
            int c,d = 0;
            for (int i = 0; i<len; i++) {
                c = 0;
                for(int j = 0; j<len; j++) {
                    if(str.charAt(i) == str.charAt(j)) {
                        c++;
                    }
                }
                if(c % 2 != 0) {
                    System.out.println("NO");
                    break;
                } else {
                    d++;
                }
            } 
            if(d == len) {
                System.out.println("YES");
            }
        }
    }    
}
