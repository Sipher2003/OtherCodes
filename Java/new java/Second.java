import java.util.Arrays;

public class Second {
    static void addelms() {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*i;
        }

    }

    static void traverselms() {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

    }

    public static void main(String[] args) {
        addelms();

    }

}
