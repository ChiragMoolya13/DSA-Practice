// Write a program to enter length and breadth of a rectangle and find its perimeter.
import java.util.*;
public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length to find perimeter: ");
        double length = sc.nextDouble();
        System.out.println("Enter Breath to find perimeter: ");
        double breadth = sc.nextDouble();

        double perimeter = 2*( length + breadth );

        System.out.println("Your perimeter is : " + perimeter);
    }
}
