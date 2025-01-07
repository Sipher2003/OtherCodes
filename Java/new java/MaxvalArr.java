public class MaxvalArr {

    public static void main(String[] args) {

        int[] arr = { 45, 11, 22, 23, 18 };

        System.out.println("Maximum value is " + maxval(arr));
        System.out.println("Maximum value is " + maxrange(arr, 1, 3));
    }

    static int maxval(int[] arr) {

        int maxv = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxv) {
                maxv = arr[i];
            }
        }

        return maxv;

    }

    static int maxrange(int[] arr, int start, int end) {

        int maxval = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }

        return maxval;
    }

}
