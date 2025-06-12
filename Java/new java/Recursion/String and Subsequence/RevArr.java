import java.util.Arrays;

public class RevArr {
    public static void main(String[] args) {

    int[] arr={2,4,6,7,9};
      System.out.println(Arrays.toString(Reverse(arr)));
    }

    static int[] Reverse(int[] arr) {
        int num = 0;
        int[] res = new int[arr.length];

        if (arr.length == 1) {
            return arr;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            res[num] = arr[i];
            num++;
        }

        return res;
    }

    static int[] Rev2(int[] arr){
        
          if (arr.length == 1) {
            return arr;
        }

        
        return arr;
    }
}
