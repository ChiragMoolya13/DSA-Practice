// Check whether a number is palindrome or not
import java.util.Scanner;
public class File4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int x = n;

        // x = 245
        // lastDigit = 5, rev = 0 * 10 + 5 = 5, x = 24
        // lastDigit = 4, rev = 5 * 10 + 4 = 54, x = 2
        // lastDigit = 2, rev = 54 * 10 + 2 = 542, x = 0
        // x = 0, x > 0 (false), LOOP STOPS.
        while(x>0){
            int lastDigit = x%10;
            rev = rev * 10 + lastDigit;
            x = x/10;
        }

        if(n==rev){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }

    }
    
}
