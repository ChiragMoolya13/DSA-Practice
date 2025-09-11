import java.util.*;
class File10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            if(i==6)
            { 
                System.out.println("cant enter 6!!!");
                continue;
            }
            System.out.println("You entered the number: " + i);
        }
    }
}
