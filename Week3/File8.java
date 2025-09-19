public class File8 {
    public static void main(String[] args) {
        int n = 5;
        // i = 1; j = 12345
        // i = 2; j = 2345
        // i = 3; j = 345
        // i = 4; j = 45
        // i = 5; j = 5
        for(int i=1; i<=n;i++)
        {
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
