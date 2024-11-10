/* A bouncy number is any non-negative integer that is neither increasing nor decreasing. */

package bouncy_number;
import java.util.Scanner;

public class Bouncy_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        if (n < 100) {
            System.out.println(n + " is not a Bouncy Number.");
            return;
        }
        
        int t = n;
        boolean isIncreasing = true, isDecreasing = true;
        
        int prev = t % 10;
        while (t != 0) {
            int d = t % 10;
            if (d > prev) {
                isIncreasing = false;
                break;
            }
            prev = d;
            t /= 10;
        }
        
        t = n;
        prev = t % 10;
        while (t != 0) {
            int d = t % 10;
            if (d < prev) {
                isDecreasing = false;
                break;
            }
            prev = d;
            t /= 10;
        }
        
        if (!isIncreasing && !isDecreasing)
            System.out.println(n + " is a Bouncy Number.");
        else
            System.out.println(n + " is not a Bouncy Number.");
    }
}

/*

OUTPUT :

Enter a number: 132
132 is a Bouncy Number.

Enter a number: 259
259 is not a Bouncy Number.

*/