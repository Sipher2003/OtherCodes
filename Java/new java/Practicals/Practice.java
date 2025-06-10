public class Practice {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        System.out.println(Linsrch(arr, 5));
        System.out.println(BinSrch(arr, 7));
    }

    static int BinSrch(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;
            if (t < arr[mid]) {
                end = mid - 1;
            } else if (t > arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    static int Linsrch(int[] arr, int t) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];

            if (target == t) {
                return i;
            }
        }

        return -1;
    }
}
