import java.util.Arrays;

public class ArrConcat {
    public static void main(String[] args) {
       int[] nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }


    static int[] getConcatenation(int[] nums) {
        int[] res=new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }

        return res;
    }
}
