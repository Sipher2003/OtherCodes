
public class MajElem {
    public static void main(String[] args) {
        int[]arr={2};
        System.out.println((majorityElement(arr)));
    }
//worst code known to mankind  :<<
    static int majorityElement(int[] nums) {
        int maj=nums.length/2;
        int count=1;

       if(nums.length>1){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
              if(nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
              }
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if(nums[k]==nums[k+1]){
                count+=1;
                if(count>maj){
                 return nums[k];
                }
            }else{
                count=1;
            }
        }
       }else{
       for (int i = 0; i < nums.length; i++) {
         return nums[i];
       }
       }
        
        return 1;
    }
}
