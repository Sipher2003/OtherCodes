import java.util.*;

class fruit {
    fruit() {
        System.out.println("this is a fruit");
    }
}

public class contru extends fruit {
    contru() {
        super();
        // super();
        System.out.println("This  is a apple");
    }
    

    public static void main(String[] args) {
        contru c1 = new contru();
    }
}
