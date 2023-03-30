import java.util.*;

class student {
    int id;
    String name;

    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.id);// accessing member through object
        System.out.println(s1.name);

        s1.id = 101;
        s1.name = "abc";
        System.out.println(s1.id);// accessing member through object
        System.out.println(s1.name);
        student s2 = new student();
        s2.id = 102;
        s2.name = "xyz";
        System.out.println("id= " + s2.id + " name =" + s2.name);

    }
}