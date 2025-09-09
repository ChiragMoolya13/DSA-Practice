// Write a java program to find maximum between three numbers using conditional operator.

import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter your third number: ");
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println(a+ " is the largest number");
        }
        else if ((b>a) && (b>c)){
            System.out.println(b+ " is the largest number");
        }
        else{
            System.out.println(c+ " is the largest number");
        }
    }
}
