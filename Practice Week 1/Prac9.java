// Write a C program to enter temperature in Fahrenheit and convert to Celsius
import java.util.*;
public class Prac9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your tempreature in Fahrenheit: ");
    double fahrenheit = sc.nextDouble();

    double celsius = ((fahrenheit-32)/(9.0/5.0));
    System.out.println("Enter your tempreature in Celsius: " + celsius);

   }
}
