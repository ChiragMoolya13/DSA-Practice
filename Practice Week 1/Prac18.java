// Write a java program to enter P, T, R and calculate Compound Interest.
import java.util.*;
public class Prac18 {
    public static double power(double a, double b){
        double answer =  1;
        for(int i = 1; i<=b;i++){
            answer = answer * a;
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        double p = sc.nextDouble();
        System.out.println("Enter t: ");
        double t = sc.nextDouble();
        System.out.println("Enter r: ");
        double r = sc.nextDouble();

        double ci = p*(1+(r/100.0));
        double a = power(ci,t);
        double CompoundIntrest = a-p;

        System.out.println(CompoundIntrest);
    }
}
