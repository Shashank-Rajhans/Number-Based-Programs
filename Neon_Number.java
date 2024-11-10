/* A neon number is a number where the sum of digits of square of the number is equal to the number. */

package neon_number;
import java.util.Scanner;

public class Neon_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int n = in.nextInt();
        int sq = n * n;
        int sqSum = 0;
        
        while (sq != 0) {
            int d = sq % 10;
            sqSum += d;
            sq /= 10;
        }
        
        if (sqSum == n)
            System.out.println(n + " is a Neon Number.");
        else
            System.out.println(n + " is not a Neon Number.");
    }
}

/*

OUTPUT :

Enter the number to check: 9
9 is a Neon Number.

Enter the number to check: 15
15 is not a Neon Number.

*/