import java.util.Arrays;

public class Insertionsort {

    public static void main(String[] args) {

        int[] arr={6,7,2,1,9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++) { // 1,2,3,4,5
            for (int j = i + 1; j > 0; j--) {

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }

            }
        }

    }
}