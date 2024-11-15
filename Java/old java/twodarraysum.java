import java.util.*;

public class twodarraysum {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("The number of A [" + i + "][" + j + "] is: ");
                A[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("The number of B [" + i + "][" + j + "] is: ");
                B[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
                // B[i][j]=sc.nextInt();
            }
            System.out.println();
        }

    }
}
