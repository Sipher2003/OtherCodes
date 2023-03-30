class stud {

    int sid;
    String sname;

    void getstud(int sid, String sname) {

        this.sid = sid;
        this.sname = sname;

    }

}

class marks extends stud {

    int m1, m2, m3;

    void getmarks(int m1, int m2, int m3) {

        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

    }

}

class fin extends marks {

    void display() {
        System.out.println("The student id is " + sid);
        System.out.println("The student name is " + sname);
        System.out.println("Marks 1 is " + m1 + " , marks 2 is " + m2 + " and marks 3 is " + m3);
        int sum = (m1 + m2 + m3);
        System.out.println("The total of the three subjects is " + sum);
        float per = (sum / 3);
        System.out.println("The percentage is " + per);

    }

}

public class testinheritance4 {

    public static void main(String[] args) {
        fin f1 = new fin();
        f1.getstud(101, "Kaustubh");
        f1.getmarks(45, 78, 89);
        f1.display();
        System.out.println("The end");

    }

}
