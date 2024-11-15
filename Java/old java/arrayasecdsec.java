import java.util.*;

class pr22 {
    Scanner sc = new Scanner(System.in);
    int i, j, num, temp;
    int A[];

    void getdata() {
        System.out.println("Enter the size of the array: ");
        num = sc.nextInt();
        A = new int[num];
        System.out.println("Enter the numbers: ");
        for (i = 0; i < num; i++) {

            A[i] = sc.nextInt();
        }
    }

    void putdata() {
        System.out.println("\n");
        System.out.println("Entered numbers from the user are: ");
        for (i = 0; i < num; i++) {
            System.out.println(A[i] + " ");

        }
        System.out.println("\n\n");

    }

    void asen() {

        for (i = 0; i < num; i++) {
            for (j = i + 1; j < num; j++) {

                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }

        }
        System.out.println("Ascending number is: ");
        for (int i = 0; i < num; i++) {

            System.out.println(A[i] + " ");
        }
        System.out.println("\n");

    }

    void dsen() {
        for (i = 0; i < num; i++) {
            for (j = i + 1; j < num; j++) {

                if (A[i] < A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }

        }
        System.out.println("Descending number is: ");
        for (int i = 0; i < num; i++) {

            System.out.println(A[i] + " ");
        }
        System.out.println("\n");

    }
}

public class arrayasecdsec {
    // private static final int[] A = null;
    // Scanner sc=new Scanner(System.in);
    // int i, j, temp;

    public static void main(String[] args) {
        pr22 ob=new pr22();
        ob.getdata();
        ob.putdata();
        ob.asen();
        ob.dsen();

    }
}
