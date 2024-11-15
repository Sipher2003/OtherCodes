class Asuper {
    int x, y, z;

    Asuper(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    void display() {

        System.out.println("The value of x is " + x + "The value of y is " + y + "The value of z is " + z);

    }
}

public class Bsub extends Asuper {
    int a, b;

    Bsub(int x, int y, int z, int a, int b) {

        super(x, y, z);
        this.a = a;
        this.b = b;

    }

    void show() {

        System.out.println("The value of a is " + a + "and the value of b is " + b);
        super.display();
        System.out.println("The value of x is " + super.x);
    }

    public static void main(String[] args) {
        Bsub b1 = new Bsub(1, 2, 3, 4, 5);
        b1.display();
        b1.show();

    }
}
