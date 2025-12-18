public class Superrr {
    public static void main(String[] args) {
        B b=new B();
        A a=new A();
        a.animal();
        b.animal();
    }
}

class A{
    String name="CAt";
    void animal(){
        System.out.println(name);
    }
}

class B extends A{
    String name="Dog";

    void animal(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
