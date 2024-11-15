public class arrayindexout {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[-1] = 5;
            System.out.println("The number is " + a[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound");

        }

    }
}
