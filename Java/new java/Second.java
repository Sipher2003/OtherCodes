import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println(max);



    }

}
