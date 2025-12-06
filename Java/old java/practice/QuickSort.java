import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr={35, 50, 15, 25, 80, 20, 90, 45};
        qcksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void qcksort(int[]nums,int l,int r){
        if(l>=r){
            return;
        }

        int pivot=partition(nums,l,r);
        qcksort(nums, l, pivot-1);
        qcksort(nums, pivot+1, r);

    }

    static int partition(int[]nums,int l,int r){
      int pivot=nums[l];
      int p=l+1;
      int q=r;

      while(p<=q){
        while (p<=q && nums[p]<pivot) {
            p++;
        }

        while (p<=q && nums[q]>pivot) {
            q--;
        }
//not crossed each other
        if(p<q){
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
        }
      }

      int temp=nums[l];
      nums[l]=nums[q];
      nums[q]=temp;

      return q;
    }
    
}
