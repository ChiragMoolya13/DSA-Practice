// Write a java program to calculate area of an equilateral triangle.
import java.util.*;
public class Prac15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your side: ");
        double side = sc.nextInt();

        double area = (1.73/4) * (side * side);

        System.out.println(area);
    }
}
