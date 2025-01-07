import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
              System.out.print(arr[row][col]+" ");
            }

            System.out.println();
        }
    }
}


// Dynamically Initializing Columns:

// After declaring the rows, you can assign different sizes for the columns in each row:
// java
// Copy code
// arr[0] = new int[3];  // Row 0 has 3 columns
// arr[1] = new int[2];  // Row 1 has 2 columns
// arr[2] = new int[4];  // Row 2 has 4 columns