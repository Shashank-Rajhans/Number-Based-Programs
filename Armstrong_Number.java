/* An Armstrong number is a number that is equal to the sum of the cubes of its own digits. */
package armstrong_number;
import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int orgNum = num;
        
        int cubeSum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
        }
        
        if (cubeSum == orgNum)
            System.out.println(orgNum + " is an Armstrong number.");
        else
            System.out.println(orgNum + " is not an Armstrong number.");
    }
}

/*

OUTPUT :

Enter Number: 153
153 is an Armstrong number.

Enter Number: 135
135 is not an Armstrong number.

*/