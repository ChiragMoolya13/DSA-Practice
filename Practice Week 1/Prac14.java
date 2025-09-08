// Write a java program to enter base and height of a triangle and find its area.

import java.util.Scanner;

public class Prac14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of the triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter height of the triangle: ");
        int h = sc.nextInt();
        int a = (b*h)/2;
        System.out.println("Area of the triangle= " + a + " sq.unit");

    }
}
