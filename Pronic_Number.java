/* A pronic number is a number that is the product of two consecutive integers. */

package pronic_number;
import java.util.Scanner;

public class Pronic_Number {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        
        boolean isPronic = false;
        
        for (int i = 1; i <= num - 1; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }
        
        if (isPronic)
            System.out.println(num + " is a Pronic Number.");
        else
            System.out.println(num + " is not a Pronic Number.");
    }
}

/*

OUTPUT :

Enter the number : 20
20 is a Pronic Number.

Enter the number : 45
45 is not a Pronic Number.

*/