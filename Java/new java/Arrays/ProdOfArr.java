import java.util.Arrays;

public class ProdOfArr {

    public static void main(String[] args) {
        int[] arr={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    static int[] productExceptSelf(int[] nums){
        int[] pre=new int[nums.length];
        int[] postt=new int[nums.length];
        int[] result=new int[nums.length];

        int runningprod=1;
        int runningprod2=1;

        for (int i = 0; i < nums.length; i++) {
            runningprod*=nums[i];
            pre[i]=runningprod;
        }

           for (int i = nums.length-1; i >=0 ; i--) {
            runningprod2*=nums[i];
            postt[i]=runningprod2;
        }


        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                result[i]=postt[i+1];
            }
            else if (i==nums.length-1) {
                result[i]=pre[i-1];
            }
            else{
                result[i]=pre[i-1]*postt[i+1];
            }
        }


        return result;
    }
    
}
