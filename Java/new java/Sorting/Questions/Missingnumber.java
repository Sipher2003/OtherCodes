// leetcode 268: Missing numbers

import java.util.Arrays;

public class Missingnumber {

    public static void main(String[] args) {
        int[] arr={4,1,2,0};
        missnum(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void missnum(int[] arr){

        int i=0;
        
        while(i<arr.length){
            int corrind=i;
            if(arr[i]!=arr[corrind]){
                int temp=arr[i];
                arr[i]=arr[corrind];
                arr[corrind]=temp;
            }
            else{
                i++;
            }


        }



        // return 0;
    }


}

