import java.util.Arrays;

public class SortingAlgorithms {

    // Selection Sort Algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort Algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = arr1.clone();

        System.out.println("Original Array: " + Arrays.toString(arr1));
        
        selectionSort(arr1);
        System.out.println("Sorted using Selection Sort: " + Arrays.toString(arr1));

        insertionSort(arr2);
        System.out.println("Sorted using Insertion Sort: " + Arrays.toString(arr2));
    }
}
