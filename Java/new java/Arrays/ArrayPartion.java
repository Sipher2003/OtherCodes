import java.util.Arrays;

public class ArrayPartion {

    public static void main(String[] args) {
        int[] arr={6,2,6,5,1,2};
        System.out.println(arraypart(arr));
    }

    static int arraypart(int[] nums){

        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length-1; i++) {
            int val1=nums[i];
            int val2=nums[i+1];
            sum+=Math.min(val1,val2);
            i++;
        }


       return sum;
    }
    
}
