public class MaxNum2d {

    public static void main(String[] args) {

        int[][] arr = {
                { 11, 33, 44 },
                { 22, 45, 67 },
                { 89, 91 },
                { 26, 31, 42, 74 }
        };

        System.out.println(srchmax(arr));

    }

    static int srchmax(int[][] arr) {

        int max=arr[0][0];

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] > max) {
                    max=arr[rows][cols];
                }
            }
        }
        return max;
    }

}
