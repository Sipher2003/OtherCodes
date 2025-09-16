public class CheckArrSorted {
    public static void main(String[] args) {

        int[] arr={1,1,3,3,2};
        System.out.println(check(arr));
    }

    static boolean check(int[] nums){
        
        boolean ans=false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]>=nums[i]){
               ans=true;
            }else{
                ans=false;
                return ans;
            }
        }
          
        return ans;
    }
}
