public class REcbinSrch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        System.out.println(BinSrch(arr, 6, 0, arr.length-1));
        
    }

    static int BinSrch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int m=start+(end-start)/2;

        if(target>arr[m]){
            return BinSrch(arr, target, m+1, end);
        }

        if(target<arr[m]){
            return BinSrch(arr, target, start, m-1);
        }

           return m;
    }
}
