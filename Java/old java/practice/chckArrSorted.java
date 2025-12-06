public class chckArrSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4};
        System.out.println(arrsor(arr));
    }

    static boolean arrsor(int[] nums){
        boolean ans=false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]>=nums[i]){
                ans=true;
            }else{
                ans=false;
            }
        }
        
        return ans;
    }
}
