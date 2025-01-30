import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr={3,6,1,8,2,9,4};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int lastind=arr.length-i-1;
            int max=maxind(arr, 0, lastind);

            swap(arr, max, lastind);

        }

    }

    static int maxind(int[] arr,int first,int last){
        int max=first;
        for (int i = first; i <= last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }


}