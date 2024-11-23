import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 2;

        System.out.println("Enter number:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.println(b);
            count++;

        }
        // System.out.println(b);
    }

}
