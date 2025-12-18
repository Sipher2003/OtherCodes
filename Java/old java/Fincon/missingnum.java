import java.util.ArrayList;
import java.util.Arrays;

public class missingnum {
public static void main(String[] args) {
    int[] arr={1,3,5,6};
    System.out.println(msnum(arr));
}   


static ArrayList<Integer> msnum(int[] arr){
    Arrays.sort(arr);
    ArrayList<Integer> lst=new ArrayList<>();
    for (int i = 0; i < arr.length-1; i++) {
        // int temp=arr[i+1];
        if (arr[i+1]!=(arr[i]+1)){
   lst.add(arr[i]+1); 
        }
    }
    
    
    return lst;
}
}
