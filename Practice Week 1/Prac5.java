// Write a program to enter length and breadth of a rectangle and find its area.
import java.util.*;
public class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length to find the area of a rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter breath to find the area of a rectangle: "); 
        double breath = sc.nextDouble();
        
        double area = breath * length;
        System.out.println("Area of a rectangle is: " + area); 
    }
}
