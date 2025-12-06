public class Inheritance{

    public static void main(String[] args) {
        Motor m=new Motor();
        System.out.println(m.brand);
        m.honk();
        m.start();
        m.run();
    }

}

class Vehicle{
   String brand="Ford";
    void start(){
        System.out.println("Car starts");
    }
}

class Car extends Vehicle{
    void honk(){
        System.out.println("Car honks");
    }
}

class Motor extends Car{
    void run(){
        System.out.println("The motor runs");
    }
}