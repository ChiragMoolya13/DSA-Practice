// Write a C program to enter P, T, R and calculate Simple Interest.
import java.util.*;
public class Prac17 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter p: ");
    double p = sc.nextDouble();    
    System.out.println("Enter t: ");
    double t = sc.nextDouble();    
    System.out.println("Enter r: ");
    double r = sc.nextDouble();    

    double simpleIntrest = (p*t*r)/100.0;

    System.out.println(simpleIntrest);
    }
}
