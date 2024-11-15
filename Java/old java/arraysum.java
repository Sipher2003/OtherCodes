import java.util.*;

public class arraysum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        int i, j;
        int sum = 0;
        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
            sum = sum + A[i];
        }
        System.out.println("The sum is: " + sum);

    }
}
