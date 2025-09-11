/*
Question 4 - Print fibonacci series upto n terms     
Example
INput: 10
output: 0 1 1 2 3 5 8 13 21 34 
*/

import java.util.Scanner;
public class File8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        f = f-2;

        System.out.print(firstTerm +" "+ secondTerm+ " ");
        while(f>0){
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            f--;
        }
    }
}
