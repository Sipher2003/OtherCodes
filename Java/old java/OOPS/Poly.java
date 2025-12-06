public class Poly {
    public static void main(String[] args) {
// Writer w=new Writer();
// w.write();
// w.write("hello");
// w.write(12);

//runtime polymorphism
Animal a =new Animal();
a.sound();

a=new dog();
a.sound();
 }

}

//Method overloading - compile time polymorphism: Same method name → different parameters.
    class Writer {
        void write() {
            System.out.println("Writer writes");
        }

        void write(int n) {
            System.out.println("Writer writes of speed " + n);
        }

        void write(String s){
            System.out.println("The content is "+s);
        }
}

//Method Overriding (Runtime Polymorphism):Child class modifies a method from the parent class.
// Behavior depends on the OBJECT at runtime.

class Animal{
    void sound(){
        System.out.println("generic sound ");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
