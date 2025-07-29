// Count the number of digits of a positive number.

import java.util.Scanner;

public class File1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        System.out.println("The number of digits are: " + count);
    }
}