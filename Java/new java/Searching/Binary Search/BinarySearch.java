public class BinarySearch {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9 10 11 12
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int[] arr2 = { 89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18 };
        System.out.println(binarysrch(arr, 22));
        System.out.println(binarysrchdec(arr2, 22));
    }

    static int binarysrch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int binarysrchdec(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
