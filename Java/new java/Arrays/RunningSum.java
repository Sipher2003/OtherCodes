// 1480. Running Sum of 1d Array

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(runSum(arr)));
    }

    static int[] runSum(int[] arr){

        int[] result=new int[arr.length];
        int sum=0;


        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            result[i]=sum;
        }
        return result;


    }
}
