class animal {

    void eat() {
        System.out.println("Eating");
    }

}

class dog extends animal {

    void bark() {
        System.out.println("Barking");

    }

}

public class testinheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        // animal a = new animal();
        d.eat();

    }
}
