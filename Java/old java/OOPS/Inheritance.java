public class Inheritance {

    public static void main(String[] args) {
        // Motor m = new Motor();
        // System.out.println(m.brand);
        // m.honk();
        // m.start();
        // m.run();

        smartphone sm=new smartphone();
        sm.another();
        sm.feature();
        mobile m=new mobile();
        m.feature();
        m.name();
    }

}
//multilevel
class Vehicle {
    String brand = "Ford";

    void start() {
        System.out.println("Car starts");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car honks");
    }
}

class Motor extends Car {
    void run() {
        System.out.println("The motor runs");
    }
}

//hierarchical

class feat {
    void feature() {
        System.out.println("This is feature 1");
    }
}

class mobile extends feat{
    void name(){
        System.out.println("This is name 1");
    }
}

class smartphone extends feat{
    void another(){
        System.out.println("this is name 2");
    }
}