/* A Tech number is a number that has an even number of digits and if the number
is split into two equal halves(From the middle), then the square of the sum of these halves is equal to the number itself. */

package tech_number;
import java.util.Scanner;

public class Tech_Number {

    public static void main(String[] args) {
        int n, num, firstHalf, secondHalf, numberOfDigits=0, squareOfTwoHalves;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        num = n;

        while (num > 0)
        {
            numberOfDigits++;
            num = num / 10;
        }
        
        if (numberOfDigits % 2 == 0)
        {
            num = n;
            firstHalf = num % (int) Math.pow(10, numberOfDigits / 2);
            secondHalf = num / (int) Math.pow(10, numberOfDigits / 2);
            
            squareOfTwoHalves = (firstHalf + secondHalf) * (firstHalf + secondHalf);
            
            if (n == squareOfTwoHalves)
            {
                System.out.println(n +" is a Tech number.");
            }
            else
            {
                System.out.println(n +" is not a Tech number.");
            }
        }
        else
        {
            System.out.println(n + " is not a Tech number.");
        }
    }
}

/*

OUTPUT :

Enter the number: 2025
2025 is a Tech number.

Enter the number: 3454
3454 is not a Tech number.

*/