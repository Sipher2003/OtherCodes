public class methodoverloading2 {

    void add(int a, int b) {
        System.out.println("The addition of a " + a + " and b " + b + " is " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("The addition of a " + a + " and b " + b + " is " + (a + b));

    }

    void add(String s1, String s2) {
        System.out.println("The addition of a " + s1 + " and b " + s2 + " is " + (s1 + s2));

    }

    public static void main(String [] args){
        methodoverloading2 m1=new methodoverloading2();
        m1.add(7, 8);
        m1.add(6.7,7.5);
        m1.add("Good","Morning");



    }

}
