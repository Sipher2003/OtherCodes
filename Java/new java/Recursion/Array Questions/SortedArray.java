public class SortedArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(SrtdArr(arr));
        System.out.println(RecSrtdArr(arr,1));
    }
//[1,2,3,4,5]
    static boolean SrtdArr(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
               return false;
            }
        }
        
        return true;
    }


    static boolean RecSrtdArr(int[] arr, int index){
        if (index==arr.length-1) {
            return true;       //base condition
        }
        
        return arr[index]<arr[index+1] && RecSrtdArr(arr,index+1);
    }



}