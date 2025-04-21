import java.util.Arrays;

public class Insertionsort {

    public static void main(String[] args) {
          int[] arr={4,7,2,3,1};
          InsertionSort(arr);
          System.out.println(Arrays.toString(arr));

    }

    static void InsertionSort(int[] arr) {
        // 1,2,3,4,5
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

    }
}