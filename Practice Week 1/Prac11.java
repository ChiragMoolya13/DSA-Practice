// Write a java program to find power of any number x ^ y.
import java.util.*;
public class Prac11 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = sc.nextInt();
        int answer = 1;
        for(int i = 1; i <= exponent; i++){
            answer = answer * base;
        }
        System.out.println(answer);
    }
}
