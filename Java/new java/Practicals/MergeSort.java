import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={3,1,6,4,8,9,7};
        System.out.println(Arrays.toString(Mrgsort(arr)));
    }

    static int[] Mrgsort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[]left=Mrgsort(Arrays.copyOfRange(arr,0 , mid));
        int[]right=Mrgsort(Arrays.copyOfRange(arr,mid , arr.length));

       return Merge(left,right);
        
        
        // return 1;
    }


    static int[] Merge(int[] left,int [] right){
        int[] merged = new int[left.length + right.length];

        int i=0;
        int j=0;
        int k=0;


        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                i++;
            }
            else{
                merged[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<left.length) {
            merged[k]=left[i];
            i++;
            k++;
        }

        while (j<right.length) {
            merged[k]=right[j];
            j++;
            k++;
        }

        return merged;
    }





}
