import java.util.Scanner;
class File5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // i = 1, j = 1 time (1)
        // i = 2, j = 2 time (21)
        // i = 3, j = 3 time (321)
        // i = 4, j = 4 time (4321)
        // i = 5, j = 5 time (54321)
        for(int i= 1; i<=n; i++){
            for(int j = i; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}