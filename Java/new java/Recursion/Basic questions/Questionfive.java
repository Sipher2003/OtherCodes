public class Questionfive {
    public static void main(String[] args) {
        System.out.println(digsum2(1));
    }

    static int digsum(int num) {

        if (num % 10 == num) {
            return num;
        }
        return digsum(num / 10) + (num % 10);

    }

    static int digsum2(int n) {
        if (n == 0) {
            return 0;
        }
        int i = 0;
        while (n > 0) {
            int rem = n % 10;
            i += rem;
            n = n / 10;
        }
        return i;
    }
}
