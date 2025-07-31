/*
Question 1 - Program to check whether a number is Armstrong number or not
Example
input: 371
output: 371 is Armstrong number
*/
import java.util.Scanner;
public class File5 {

    public static int powerFn(int a, int b){
        // a^b = a * a * a ....... b times
        int answer = 1;
        for(int i=1; i<=b; i++){
            answer = answer * a;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int copyOfN = n;
        int numberOfDigits = 0;

        //number of digits
        while(n>0){
            numberOfDigits++;
            n = n/10;
        }

        int sum = 0;
        n = copyOfN;

        // getting sum of digits
        while(n>0){
            int lastDigit = n%10; // find the last digit
            sum = sum + powerFn(lastDigit, numberOfDigits);
            n = n/10; // remove the last digit
        }

        // Cheking if its Armstrong Number or not
        if(sum == copyOfN){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
