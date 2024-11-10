/* A number where the sum of the digits equals the cube root of the number. */

package dudeney_number;
import java.util.Scanner;

public class Dudeney_Number {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int cubeRoot = (int)Math.round(Math.cbrt(n));
        if (cubeRoot * cubeRoot * cubeRoot == n) {
            int s = 0;
            int t = n;
            while (t != 0) {
                int d = t % 10;
                s += d;
                t /= 10;
            }
            
            if (s == cubeRoot) {
                System.out.println(n + " is a Dudeney number.");
            }
            else {
                System.out.println(n + " is not a Dudeney number.");
            }
        }
        else {
            System.out.println(n + " is not a Dudeney number.");
        }
    }
}

/*

OUTPUT :

Enter the number: 512
512 is a Dudeney number.

Enter the number: 256
256 is not a Dudeney number.

*/