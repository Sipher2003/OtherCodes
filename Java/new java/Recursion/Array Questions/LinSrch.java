public class LinSrch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(RecLinSrch(arr, 4, 0));
    }

    static int RecLinSrch(int[] arr,int target,int index){
        if (index==arr.length) {
            return -1;
        }
     
       if(arr[index]==target){
        return index;
       }else{
        return RecLinSrch(arr, target, index+1);
       }
    
    }
}
