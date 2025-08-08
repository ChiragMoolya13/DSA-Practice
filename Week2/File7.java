/*
Question 3 - Program to find prime factors of a number
Example
input: 10
output: 2 5 
*/

public class File7 {

    public static boolean isPrime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 24;

        for(int i = 1; i<=n; i++){
            if(n%i==0 && isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }
    
}
