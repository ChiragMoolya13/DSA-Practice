public class File9 {
    public static void main(String[] args) {
        int n = 5;
        //Upper part (1...N)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Lower Part (n-1....1)
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
