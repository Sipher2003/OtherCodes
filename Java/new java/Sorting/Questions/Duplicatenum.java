//287. Find the Duplicate Number

import java.util.Arrays;

public class Duplicatenum {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
      System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums){
        int i=0;

        while(i<nums.length){
            int corrind=nums[i]-1;
            if(nums[i]!=nums[corrind]){
                int temp=nums[i];
                nums[i]=nums[corrind];
                nums[corrind]=temp;

            }
            else if(nums[i]!=(nums[corrind])){
                i++;
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(j!=(nums[j]-1)){
                 return nums[j];
            }            
        }
        
        return 0;
    }
}
