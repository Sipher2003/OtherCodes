import java.util.Arrays;

public class Searchin2dArr {

    public static void main(String[] args) {

        int[][] arr = {
                { 11, 33, 44 },
                { 22, 45, 67 },
                { 89, 91 },
                { 26, 31, 42, 74 }
        };

        int target = 30;
        System.out.println(srch2d(arr, target));
        System.out.println(Arrays.toString(retInd(arr, target)));

    }

    static boolean srch2d(int[][] arr, int target) {

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // returning the index position after searching

    static int[] retInd(int[][] arr, int target) {

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] == target) {
                    return new int[] { rows, cols };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
