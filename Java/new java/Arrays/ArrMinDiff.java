import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrMinDiff {
    public static void main(String[] args) {
        int[] arr={4,2,1,3};
        System.out.println(MinAbsdiff(arr));
    }

    static List<List<Integer>> MinAbsdiff(int[] arr){

        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        // int i=0;

        int min_diff=Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            min_diff=Math.min(arr[i]-arr[i-1],min_diff);
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[i-1]==min_diff){
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i]-1);
                pair.add(arr[i]);
                res.add(pair);
            }
        }

        
        return res;

    }

}
