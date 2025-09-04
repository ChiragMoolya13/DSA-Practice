// Write a program to enter two numbers and perform all arithmetic operations.
import java.util.*;
public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Addition of 2 numbers are: " + (a+b));
        System.out.println("Subraction of 2 numbers are: " + (a-b));
        System.out.println("Multiplication of 2 numbers are: " + (a*b));
        System.out.println("Division of 2 numbers are: " + (a/b));
        System.out.println("Modulo of 2 numbers are: " + (a%b));
    }
}
