//outer loop is for rows and inner for columns
public class Pattern1 {

    public static void main(String[] args) {
        // ptrn1(5);
        // ptrn2(5);
        // ptrn3(5);
        // ptrn4(5);
        // ptrn5(5);
        ptrn6(5);
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
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

        for (int rows = 1; rows < 2 * n; rows++) {
            int totalcols = rows > n ? n - (rows - n) : rows;

            int totalspaces= n-totalcols;
            for (int s = 1; s <= totalspaces; s++) {
                System.out.print(" ");
            }

            for (int cols = 1; cols <= totalcols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
