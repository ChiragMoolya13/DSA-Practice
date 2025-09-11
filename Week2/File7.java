/*
Question 3 - Program to find prime factors of a number
Example
input: 10
output: 2 5 
*/
import java.util.*;
public class File7
{

    public static boolean isPrime(int n)
    {
        int count = 0;
        for(int i = 1; i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<=a;i++){
            if((a%i==0) && (isPrime(i)==true)){
                System.out.print(i+ " ");
            }
        }
    }
}
