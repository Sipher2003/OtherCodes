import java.util.Scanner;
import java.util.ArrayList;

public class Pracs1A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.println("Enter the elements for the array");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            int ele = sc.nextInt();
            a1.add(ele);
        }

        System.out.println("The elemnts are");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }

    }

}
