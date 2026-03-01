public class Subarraysumeqk {

    public static void main(String[] args) {
        int[] arr={1,1,1};
        int t=2;
        System.out.println(subarray(arr, t));
    }


//[1,1,1], k = 2
static int subarray(int[] nums, int t){
    int count=0;

    for (int i = 0; i < nums.length; i++) {
        int sum=0;   
        for (int j = i; j < nums.length; j++) {
            sum+=nums[j];
            if(sum==t){
                count+=1;;
            }
            
        }
    }

        return count;
    }
    
}
