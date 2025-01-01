public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArm(153));

    }

    static boolean isArm(int n) {
        int org=n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int cube = rem * rem* rem;
            sum = sum + cube;
            n /= 10;

        }
        if (sum == org) {
            return true;
        }

        return false;
    }

}
