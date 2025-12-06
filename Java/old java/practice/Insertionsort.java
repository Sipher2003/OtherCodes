import java.util.Arrays;

public class Insertionsort {
public static void main(String[] args) {
    int[] arr={7,9,3,2,1};
    System.out.println("Before "+Arrays.toString(arr));
    insertion(arr);
    System.out.println("After "+Arrays.toString(arr));
}

static void insertion(int[] nums){
    for (int i = 0; i < nums.length-1; i++) {
        for (int j = i+1; j >0; j--) {
            if(nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
            else{
                break;
            }
        }
    }
}
    
}
