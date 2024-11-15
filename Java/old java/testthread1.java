
public class hi {
    
    public void he1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

public class hello {

    public void hell() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
public class testthread1 {

    public static void main(String[] args) {

        hi h1=new hi();
        hello h2=new hello();
        h1.he1();
        h2.hell();

    }
}
