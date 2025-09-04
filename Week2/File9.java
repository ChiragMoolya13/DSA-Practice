import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i>=0; i++)
        {
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n==10)
            { 
                System.out.println("You entreed the number 10 now the program stops!");
                break;
            }
            System.out.println("You entered the numebr: " + n);
        }
    }
}