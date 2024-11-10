/* Buzz numbers are those numbers that are divisible by seven or end with seven. */

package buzz_number;
import java.util.Scanner;

public class Buzz_Number {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        
        if(num % 10 == 7 || num % 7 == 0)
            System.out.println(num+" is a Buzz number.");
        else
            System.out.println(num+" is not a Buzz number.");  
    }
    
}

/*

Output: 

Enter a number: 49
49 is a Buzz number.

Enter a number: 49
49 is a Buzz number.

Enter a number: 49
49 is a Buzz number.

*/