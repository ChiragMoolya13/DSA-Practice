/*
Question 2 - Problem to find Armstrong numbers between 1 to n
Example
 input: 1 1000
 output: 1 2 3 4 5 6 7 8 9 370 371 407
 */

import java.util.Scanner;
public class File6 {

    public static int powerOfN(int a, int b){
        int answer = 1;
        for(int i = 1; i<=b;i++){
            answer = answer * a;
        }
        return answer;
    }
    public static boolean isArmstrong(int n){
        int copyOfN = n;
        int numberOfDigits = 0;
        while(n>0){
            numberOfDigits++;
            n=n/10;
        }
        n = copyOfN;
        int sum = 0;

        while(n>0){
            int lastDigit = n%10;
            sum = sum + powerOfN(lastDigit, numberOfDigits);
            n=n/10;
        }
        if(sum == copyOfN){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int startNumber = sc.nextInt();
        System.out.println("Enter Last Number: ");
        int lastNumber = sc.nextInt();

        for(int i = startNumber; i <= lastNumber; i++ ){
                if(isArmstrong(i)==true){
                    System.out.println(i + " ");
                }
        }
        
    }
}
