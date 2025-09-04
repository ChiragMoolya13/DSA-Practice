// Write a program to enter radius of a circle and find its diameter, circumference and area.
import java.util.*;
public class Prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius to find diameter, circumference and area of a circle: ");
        double radius = sc.nextDouble();
        
        double diameter = 2*radius;
        double circumference = 2*3.14*radius;
        double area = 3.14*radius*radius;
        
        System.out.println("Diameter of a circle is: " + diameter);
        System.out.println("Circumference of a circle is: "+ circumference);
        System.out.println("Area of a circle is: " + area);

    }
}
