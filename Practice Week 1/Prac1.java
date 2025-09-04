//Write a C program to perform input/output of all basic data types.
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your integer: ");
        int a = sc.nextInt();
        System.out.println("Enter your Long Number: ");
        long b = sc.nextLong();
        System.out.println("Enter your Float Number: ");
        float c = sc.nextFloat();
        System.out.println("Enter your Double Number: ");
        double d = sc.nextDouble();
        System.out.println("Enter your Boolean Value: ");
        boolean e = sc.nextBoolean();
        System.out.println("Enter your String: ");
        String f = sc.next();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}