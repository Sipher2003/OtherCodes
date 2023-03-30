public class methodoverloading1 {
    void display() {

        System.out.println("This is a methodoverloading program");
    }

    void display(int a, int b) {
        System.out.println("The value of a is " + a + " and the value of b is " + b);

    }

    void display(double a,double b){
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
    public static void main(String []args){
        methodoverloading1 m1=new methodoverloading1();
        m1.display();
        m1.display(2,5);
        m1.display(2.7,5.6);
        

    }

}
