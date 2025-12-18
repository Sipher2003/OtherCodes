import java.lang.reflect.Array;
import java.util.Arrays;

public class Double {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    
    for (int i = 0; i < arr.length; i++) {
        arr[i]=arr[i]+arr[i];
    }
    System.out.println(Arrays.toString(arr));
    }
    
}
