// Write a C program to enter two numbers and find their sum.
import java.util.*;
class Prac2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Your 2nd Number: ");
        int b = sc.nextInt();
        
        int c = a + b;
        System.out.println("The sum of 2 Numbers is: " + c);



    }
}
