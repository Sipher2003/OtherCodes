//Leetcode 1295:Find Numbers with Even Number of Digits

public class EvenLengthCount {

    public static void main(String[] args) {

        int[] arr = { 12, 345, 2, 6, 7896 };

        // System.out.println(srchEven(arr));
        // System.out.println(srchEven2(arr));
        System.out.println(srchEvenoptimal(arr));
    }

    static int srchEven(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (chkeeven(i)) {
                count++;
            }
        }
        return count;

    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static boolean chkeeven(int num) {
        int numofdigits = digits(num);
        if (numofdigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int srchEven2(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            String strnum = String.valueOf(arr[i]);
            int len = strnum.length();
            if (len % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    // optimal solution as per leetcode

    static int srchEvenoptimal(int[] arr) {
        int count = 0;

        for (int i : arr) {
            int digits = 0;
            while (i > 0) {
                digits++;
                i /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
