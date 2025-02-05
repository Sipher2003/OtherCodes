// leetcode 268: Missing numbers

public class Missingnumber {

    public static void main(String[] args) {
        int[] nums={4,1,2,0};
        System.out.println(missnum(nums));;
        // System.out.println(numsays.toString(nums));
    }

    static int missnum(int[] nums){

      int i =0;
      
      while(i<nums.length){
          int corrind=nums[i];
          if(nums[i]<nums.length&&nums[i]!=nums[corrind]){
            int temp=nums[i];
            nums[i]=nums[corrind];
            nums[corrind]=temp;
          }
          else{
            i++;
          }

      }

      for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=j){
            return j;
        }
      }

        return nums.length;
    }


}

