// Write a Java program to convert days into years, weeks and days.
import java.util.*;
public class Prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of days: ");
        double days = sc.nextDouble();
        double years = days/365.0;
        double weeks = (days - (years * 365)) / 7.0;
        int day = (days - ((years * 365) + (weeks * 7)));

        System.out.println(days + " Days is " + years + " Year and " + weeks + " Weeks" + day);



    }
}
