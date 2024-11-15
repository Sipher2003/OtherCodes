public class constructor2 {
    String sname;
    double per;

    constructor2(String sname, double per) {
        this.sname = sname;
        this.per = per;

    }

    constructor2(String sname) {

        this.sname = sname;
    }

    void show() {
        System.out.println("the name is " + sname + " and the percentage is " + per);

    }

    public static void main(String[] args) {
        constructor2 c1 = new constructor2("abcd", 56.78);
        c1.show();
        constructor2 c2 = new constructor2("abcd");
        c2.show();

        // constructor2 c1 = new constructor2("abcd", 56.78);

    }
}
