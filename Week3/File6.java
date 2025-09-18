import java.util.Scanner;
class File6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 5;
        // i = 1, j = 1 time (5)
        // i = 2, j = 2 time (44)
        // i = 3, j = 3 time (333)
        // i = 4, j = 4 time (2222)
        // i = 5, j = 5 time (11111)
        for(int i= 1; i<=n; i++){
            for(int j = i; j>=1;j--){
                System.out.print(number);
            }
            number--;
            System.out.println();
        }
    }
}