/* An Abundant number is a number for which the sum of its proper factors is greater than the number itself. */

package abundant_number;
import java.util.Scanner;

public class Abundant_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        
        if (sum > n)
            System.out.println(n + " is an Abundant Number.");
        else
            System.out.println(n + " is not an Abundant Number.");
    }
}

/*

OUTPUT :

Enter the number: 18
18 is an Abundant Number.

Enter the number: 22
22 is not an Abundant Number.

*/
