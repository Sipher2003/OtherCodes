//leetcode 448. Find All Numbers Disappeared in an Array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappearednums {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(disapnums(arr));;
        
        }

    static List<Integer> disapnums(int [] arr){
        List<Integer> ans = new ArrayList<>();
        int i=0;

        while(i<arr.length){
            int corrind=arr[i]-1;
            if(arr[i]!=arr[corrind]){
                int temp=arr[i];
                arr[i]=arr[corrind];
                arr[corrind]=temp;

            }
            else if(arr[i]!=(arr[corrind])){
                i++;
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=(j+1)){
                ans.add(j+1);
            }
        }
        return ans ;

    }
}
