/* A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. */

package duck_number;
import java.util.Scanner;

public class Duck_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String str1 = sc.nextLine();
 
        int l = str1.length();  
        int ctr = 0;  
        char chr;
 
        for(int i=1;i<l;i++)
        {
            chr = str1.charAt(i); 
            if(chr=='0')
                ctr++;
        }
 
        char f = str1.charAt(0); 
 
        if(ctr>0 && f!='0')
            System.out.println(str1 + " is a Duck Number.");
        else
            System.out.println(str1 + " is not a Duck Number.");
    }
}

/*

OUTPUT :

Enter a number : 2048
2048 is a Duck Number.

Input a number : 124
124 is not a Duck Number.

Enter a number : 0246
0246 is not a Duck Number.

*/
