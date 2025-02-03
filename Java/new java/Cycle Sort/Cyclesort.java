import java.util.Arrays;

public class Cyclesort {    //only works on arr which has 1 to n elements

    public static void main(String[] args) {
        int[] arr={5,4,2,1,3};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr){

        int i=0;
        while(i<arr.length){
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
        }

    }
}