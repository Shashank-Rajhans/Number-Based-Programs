/* A number divisible by the sum of its digits. */

package niven_number;
import java.util.Scanner;

public class Niven_Number {

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
         
        if(r == 0)
            System.out.println(num + " is a Niven Number.");
        else
            System.out.println(num + " is not a Niven Number.");      
    }
}

/*

OUTPUT :

Enter a number: 1729
1729 is a Niven Number.

Enter a number: 2048
2048 is not a Niven Number.

*/