// Write a C program to enter marks of five subjects and calculate total, average and percentage.
import java.util.*;
public class Prac16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths marks: ");
        double math = sc.nextDouble();
        System.out.println("Enter English marks: ");
        double english = sc.nextDouble();
        System.out.println("Enter Physics marks: ");
        double physics = sc.nextDouble();
        System.out.println("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();
        System.out.println("Enter Biology marks: ");
        double biology = sc.nextDouble();

        double total = math+english+physics+chemistry+biology;
        double average = (total)/5;
        double percentage = (total/500)*100;

        System.out.println("Your total for all the subjects are: "+ total);
        System.out.println("Your average for all the subjects are: "+ average);
        System.out.println("Your percentage for all the subjects are: "+ percentage);
    }
}
