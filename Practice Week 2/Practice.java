// Write a java program to find maximum between two numbers using conditional operator.

import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " is the grater number");
        }
        else{
            System.out.println(b + " is the grater number");
        }
    }
}