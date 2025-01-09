public class MaxNum {
    public static void main(String[] args) {
        int[] arr={10,20,30,50,40};

        System.out.println(srchMax(arr));

    }

    static int srchMax(int[] arr){
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
}
