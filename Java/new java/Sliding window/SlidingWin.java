public class SlidingWin {

    public static void main(String[] args) {
       int[] arr={2,3,7,4,9}; 
    System.out.println(maxsubarr(arr, 3));
    }

    //1. Fixed size 
    // return max subarray of length k

    static int maxsubarr(int[] nums,int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int maxsum=sum;

        for (int end = k; end < nums.length; end++) {
            sum+=nums[end]-nums[end-k];
            maxsum=Math.max(sum,maxsum);
        }
        
        return maxsum;
    }

    //2. Variable size
    //length of the smallest subarray with sum 
    static int minsubarrlen(int [] nums, int target){
         int start=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;

        for(int end=0;end<nums.length;end++){
            sum+=nums[end];

            while(sum>=target){
                minlen=Math.min(minlen,end-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
}

