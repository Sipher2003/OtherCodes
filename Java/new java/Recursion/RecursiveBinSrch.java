public class RecursiveBinSrch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinSrch(arr, 7, 0, arr.length-1));
    }

    static int BinSrch(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int m=s+(e-s)/2;

        if(target<arr[m]){
            return BinSrch(arr,target,s,e=m-1);
        }
        if(target>arr[m]){
            return BinSrch(arr, target, s=m+1, e);
        }
        return m;

    }
}
