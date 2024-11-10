/* A Harshad number where the sum of the digits, when repeatedly added, equals 1. */

package harshad_magic_number;
import java.util.Scanner;

public class Harshad_Magic_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = in.nextInt();
        int x = num, rem = 0, sum = 0;
        while(x > 0) {
            rem = x % 10;
            sum = sum + rem;
            x = x / 10;
        }
        int r = num % sum;
        
        int n = num;
        while (n > 9) {
            int sum1 = 0;
            while (n != 0) {
                int d = n % 10;
                n /= 10;
                sum1 += d;
            }
            n = sum1;
        }
        if (r == 0 && n == 1)
            System.out.println(num + " is a Harshad Magic Number.");
        else
            System.out.println(num + " is not a Harshad Magic Number.");

    }
}

/*

OUTPUT :

Enter a number: 1729
1729 is a Harshad Magic Number.

Enter a number: 24
24 is not a Harshad Magic Number.

*/