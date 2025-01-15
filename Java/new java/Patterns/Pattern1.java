//outer loop is for rows and inner for columns
public class Pattern1 {

    public static void main(String[] args) {
        // ptrn1(5);
        // ptrn2(5);
        // ptrn3(5);
        // ptrn4(5);
        // ptrn5(5);
        // ptrn6(5);
        // ptrn7(5);
        ptrn8(5);
    }

    static void ptrn1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 1; i <= n; i++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void ptrn2(int n) {
        // *
        // **
        // ***
        // ****
        // *****

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ptrn3(int n) {
        // *****
        // ****
        // ***
        // **
        // *

        // hint: total rows - no of row+1
        // *** eg: 5 - 1 + 1 =5 , 5 - 2 + 1 =4,......

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n - rows + 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void ptrn4(int n) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for (int i = 1; i <= n; i++) {
            for (int cols = 1; cols <= i; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void ptrn5(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        for (int rows = 1; rows < 2 * n; rows++) {
            int totalcols = rows > n ? n - (rows - n) : rows;
            for (int cols = 1; cols <= totalcols; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ptrn6(int n) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for (int rows = 1; rows < 2 * n; rows++) {
            int totalcols = rows > n ? n - (rows - n) : rows;

            int totalspaces = n - totalcols;
            for (int s = 1; s <= totalspaces; s++) {
                System.out.print("-");
            }

            for (int cols = 1; cols <= totalcols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ptrn7(int n) {
        // 1
        // 2 1 2
        // 3 2 1 2 3
        // 4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    static void ptrn8(int n) {

        // 1
        // 212
        // 32123
        // 4321234
        // 32123
        // 212
        // 1

        for (int i = 1; i <= 2 * n; i++) {
            int totalcols = i > n ? n - (i - n) : i;

            for (int s = 1; s <= n - totalcols; s++) {
                System.out.print(" ");
            }
            for (int j = totalcols; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= totalcols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
