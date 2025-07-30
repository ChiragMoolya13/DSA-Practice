// Get the sum of all the digits

import java.util.Scanner;

public class File2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        //n = 1478, sum = 0
        //STEP 1: lastDigit = 8, sum = 8, n = 147
        //STEP 2: lastDigit = 7, sum = 15, n = 14
        //STEP 3: lastDigit = 4, sum = 19, n = 1
        //STEP 4: lastDigit = 1, sum = 20, n = 0
        //STEP 5: n is zero (LOOP STOP)

        while(n>0){
            int lastDigit = n%10; // GET last Digit
            sum = sum + lastDigit;
            n = n/10; // REMOVE last Digit
        }
        System.out.println(sum);
    }
}
