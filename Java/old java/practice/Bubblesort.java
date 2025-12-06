import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[]arr={7,9,3,2,1};
        System.out.println("Before sorting "+Arrays.toString(arr));
        bubble(arr);
        System.out.println("Before sorting "+Arrays.toString(arr));
    }

    static void bubble(int[]nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}
