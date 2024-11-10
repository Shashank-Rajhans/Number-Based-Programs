/* A number that is part of a sequence where each term is the sum of the
preceding three terms, starting with 0, 1, and 1. */

package tribonacci_number;
import java.util.Scanner;

public class Tribonacci_Number {

    public static boolean isTribonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int t1 = 0, t2 = 1, t3 = 1;
        int nextTribonacci = t1 + t2 + t3;

        while (nextTribonacci < num) {
            t1 = t2;
            t2 = t3;
            t3 = nextTribonacci;
            nextTribonacci = t1 + t2 + t3;
        }

        return nextTribonacci == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if (isTribonacci(number)) {
            System.out.println(number + " is a Tribonacci number.");
        } else {
            System.out.println(number + " is not a Tribonacci number.");
        }

        scanner.close();
    }
}

/*

OUTPUT :

Enter a number : 13
13 is a Tribonacci number.

Enter a number : 15
15 is not a Tribonacci number.

*/