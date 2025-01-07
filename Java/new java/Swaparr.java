import java.util.Arrays;

public class Swaparr {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
