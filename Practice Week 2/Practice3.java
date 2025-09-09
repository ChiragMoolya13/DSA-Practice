//Write a java program to check whether year is leap year or not using conditional operator.

import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a%4==0) && (a%100!=0)){
            System.out.println("Leap Year!");
        }
        else if (a%400==0){
            System.out.println("Leap Year!");
        }
        else{
            System.out.println("Not Leap Year!");
        }
    }
}
