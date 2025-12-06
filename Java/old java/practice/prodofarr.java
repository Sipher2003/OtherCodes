import java.util.Arrays;

public class prodofarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arrprod(arr)));

    }

    static int[] arrprod(int[] nums){
        int[] res=new int[nums.length];
        int[] pre=new int[nums.length];
        int[] post=new int[nums.length];

        int runprod1=1;
        int runprod2=1;

        for (int i = 0; i < nums.length; i++) {
          runprod1*=nums[i];
          pre[i]=runprod1;            
        }

        for(int i=nums.length-1;i>=0;i--){
            runprod2*=nums[i];
            post[i]=runprod2;
        }

        for (int i = 0; i < res.length; i++) {
            if(i==0){
                res[i]=post[i+1];
            }else if(i==res.length-1){
                res[i]=pre[i-1];
            }else{
                res[i]=pre[i-1]*post[i+1];
            }
        }



        return res;
    }
}
