/* A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. */

package spy_number;
import java.util.Scanner;

public class Spy_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        int digit, sum = 0;
        int orgNum = num;
        int product = 1;
        
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        
        if (sum == product)
            System.out.println(orgNum + " is a Spy Number.");
        else
            System.out.println(orgNum + " is not a Spy Number.");
    }
    
}

/*

OUTPUT :

Enter a number: 1124
1124 is a Spy Number.

Enter a number: 1234
1234 is not a Spy Number.

*/