// Write a java program to enter any number and calculate its square root.
import java.util.*;
public class Prac12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double fact = 0;
        for(int i = 1; i<=number; i++){
            if(i*i<=number){
                fact = i;
            }
        }
        System.out.println(fact);
    }
}
