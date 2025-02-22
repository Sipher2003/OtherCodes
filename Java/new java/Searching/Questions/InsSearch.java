public class InsSearch {

    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }

    static int searchInsert(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }else if(target<nums[0]){
                return 0;
            }else if(target>nums[nums.length-1]){
                return nums.length;
            }
            else if(nums[i]<target && target<nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}