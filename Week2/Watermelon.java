import java.util.*;

class Watermelon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 4 && a % 2 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}