// Write a program to enter length in centimeter and convert it into meter and kilometer.
import java.util.*;
public class Prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in centimeter: ");
        double lengthCentimeter = sc.nextDouble();

        double meter = lengthCentimeter/100;
        double kilometer = lengthCentimeter/100000;
        System.out.println(lengthCentimeter + " centimeter is " + meter + " Meter and " + kilometer + " Kilometer");
    }
}
