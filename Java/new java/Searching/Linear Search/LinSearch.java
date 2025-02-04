public class LinSearch {
    public static void main(String[] args) {
        // System.out.println("hello world");

        int[] arr={10,20,30,40,50,60};

        System.out.println(linsrch(arr, 30));
    }

    static int linsrch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
