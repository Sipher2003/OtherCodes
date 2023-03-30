import java.util.*;

public class whi {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        while (i <= 10) {
            System.out.println(" " + (n * i));
            i++;
        }
    }

}
