import java.util.*;

class emp1 {
    int id, age;
    String name;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        age = sc.nextInt();
        name = sc.next();

    }

    void showdata() {
        System.out.println("Employee name is " + name);
        System.out.println("Employee id is " + id);
        System.out.println("Employee age is " + age);
    }
}

public class meth {

    public static void main(String[] args) {
        emp1 e1 = new emp1();
        e1.getdata();
        e1.showdata();

    }
}
