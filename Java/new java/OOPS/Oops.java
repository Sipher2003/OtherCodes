public class Oops {
    public static void main(String[] args) {
     Animal anm= new Animal();
     Dog dg= new Dog();
    //  anm.eat();
    //  dg.drink();
    //  dg.eat();
    Animal dg2 = new Dog();
    dg2.eat();
    
    }

}

class Animal {
    static void eat() {
        System.out.println("This is eating");
    }

}

class Dog extends Animal {
    static void drink() {
        System.out.println("This is drinking");
    }

}
