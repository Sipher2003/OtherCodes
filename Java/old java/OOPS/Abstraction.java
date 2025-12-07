public class Abstraction {
    //Abstraction = showing only essential features and hiding unnecessary details.
//     What is an abstract class?

// An abstract class is a class that:

// Cannot be created as an object

// Can contain abstract methods (methods without a body)

// Forces child classes to implement those methods
    public static void main(String[] args) {
        Machine m =new Car();
        m.start();
        
    }

    
}

    abstract class Machine{
        abstract void start();
    }

    class Car extends Machine{
        void start(){
            System.out.println("The car starts");
        }
    }
