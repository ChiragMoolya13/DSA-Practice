

public class File3 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;
        for(int i = 1; i<=n;i++)
        {
            for(int j = 1; j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<= star ;j++)
            {
                System.out.print("*");
            }
            star = star + 2;
            space = space - 1;
            System.out.println();
        }

        space = 1;
        star = star - 4;
        for(int i = 1; i<=n-1;i++)
        {
            for(int j = 1; j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=star;j++)
            {
                System.out.print("*");
            }
            star = star - 2;
            space = space + 1;
            System.out.println();

        }
    }
}
