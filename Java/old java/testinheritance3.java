import java.util.*;

class cal {

    double a, b;

    void ab() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextDouble();
        System.out.println("Enter the Second number: ");
        b = sc.nextDouble();
    }
}

class add extends cal {

    double cd() {

        return (a + b);

    }

}

public class testinheritance3 {
    public static void main(String[] args) {
        add a1 = new add();
        a1.ab();
        double ans = a1.cd();
        System.out.println("The answer is " + ans);

    }

}
