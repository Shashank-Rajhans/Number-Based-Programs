/* A number is said to be the Disarium number when the sum of its digit raised
to the power of their respective positions is equal to the number itself. */

package disarium_number;
import java.util.Scanner;

public class Disarium_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int orgNum = num;
        int digitCount = 0;
        
        while (num != 0) {
            num /= 10;
            digitCount++;
        }
        
        num = orgNum;
        int sum = 0;
        
        while (num != 0) {
            int d = num % 10;
            sum += Math.pow(d, digitCount);
            digitCount--;
            num /= 10;
        }
        
        if (sum == orgNum)
            System.out.println(orgNum + " is a Disarium Number.");
        else
            System.out.println(orgNum + " is not a Disarium Number.");
    }
}

/*

OUTPUT :

Enter the number: 175
175 is a Disarium Number.

Enter the number: 185
185 is not a Disarium Number.

*/