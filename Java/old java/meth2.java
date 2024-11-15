import java.util.*;

class emp6 {
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

public class meth2 {
    public static void main(String[] args) {
        emp6 e6[] = new emp6[3];

        for (int i = 0; i < 3; i++) {
            e6[i]=new emp6();
            e6[i].getdata();
            e6[i].showdata();

        }
    }
}
