class File1{
    public static void main(String[] args) {
        int n = 5;

        // i = 1, j --> (1 2 3 4 5) (* * * * * Line Change)
        // i = 2, j --> (1 2 3 4 5) (* * * * * Line Change)
        // i = 3, j --> (1 2 3 4 5) (* * * * * Line Change)
        // i = 4, j --> (1 2 3 4 5) (* * * * * Line Change)
        // i = 5, j --> (1 2 3 4 5) (* * * * * Line Change)

        for(int i = 1; i<=n; i++) // row --> lines (outer loop)
        { 
            for(int j = 1; j<=n; j++) // column --> what is printed in
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
