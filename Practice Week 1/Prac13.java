// java program to find angles of triangle if two angles are given

import java.util.Scanner;

class Prac13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = 180 - (a + b);

        System.out.println(c);
    }
}