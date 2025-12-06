import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
     int[] arr={4,5,2,3,6,1,8};
     System.out.println(Arrays.toString(Mergesort(arr)));
    }

    static int[] Mergesort(int[] nums){

        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;

        int[] left=Mergesort(Arrays.copyOfRange(nums, 0, mid));
        int[] right=Mergesort(Arrays.copyOfRange(nums, mid, nums.length));

        return Merge(left,right);
    }

    static int[] Merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;

        int[] comb=new int[left.length+right.length];
        
        while (i<left.length && j<right.length) {
            if(left[i]<right[j]){
                comb[k]=left[i];
                i++;
            }else{
                comb[k]=right[j];
                j++;
            }
            k++;

        }

        while (i<left.length) {
            comb[k]=left[i];
            i++;
            k++;
        }

        
        while (j<right.length) {
            comb[k]=right[j];
            j++;
            k++;
        }
        
        return comb;

    }

    
}
