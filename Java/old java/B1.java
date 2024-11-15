class A {

    A(int x, int y) {

        System.out.println("X is called " + x + "and y is called " + y);

    }

}

class B1 extends A {
    int z;

    B1(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("B is called " + z);

    }

    public static void main(String[] args) {

        B1 b1 = new B1(3, 2, 4);

    }

}
