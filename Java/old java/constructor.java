import java.util.*;

public class constructor {

    int eid;
    String ename;

    constructor(int empid, String empname) {
        this.eid = empid;
        ename = empname;
    }

    void show() {
        System.out.println("eid is " + eid);
        System.out.println("ename is " + ename);

    }

    public static void main(String[] args) {
        constructor c1 = new constructor(101, "abcd");
        c1.show();

    }

}
