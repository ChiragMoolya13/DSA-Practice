public class File2 {
   public static void main(String[] args) {
       int n = 5;
       int space = 0;

       //LOOP 1
       for(int i = 1; i<=n; i++) // row --> lines (outer loop)
       {
        // LOOP 2
        // space = 0 (0 space)
        // space = 1 (1 space)
        // space = 2 (1 space)
        // space = 3 (1 space)
        // space = 4 (1 space)
        for (int j = 1; j<=space;j++)
        {
            System.out.print(" ");           
        }
        // LOOP 3
        for(int j = 1; j<=n;j++)// column --> what is printed in
        {
            System.out.print("*");
        }
        space = space + 1; 
        System.out.println();
       }
   } 
}
