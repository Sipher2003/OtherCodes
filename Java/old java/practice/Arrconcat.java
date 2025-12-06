import java.util.Arrays;

public class Arrconcat {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(concatarr(arr)));
    }

    static int[] concatarr(int[] arr){
        int[]res=new int[arr.length*2];

        for (int i = 0; i < arr.length; i++) {
            res[i]=arr[i];
            res[i+arr.length]=arr[i];
        }

        return res;
    }
}
