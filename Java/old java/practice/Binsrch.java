public class Binsrch {
    public static void main(String[] args) {
        
        int[]arr={1,2,3,4,5};
        // System.out.println(binsrch(arr, 2));
        System.out.println(recbinsrch(arr, 2,0,4));
    
    }

    static int binsrch(int[] arr,int target){
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(target<arr[mid]){
                r=mid-1;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }else{
            return mid;
        }
        }
        return -1;
    }

    static int recbinsrch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int m=start+(end-start)/2;

        if(target>arr[m]){
            return recbinsrch(arr, target,m+1,end);
        }
        if(target<arr[m]){
            return recbinsrch(arr, target, start,m-1);
        }
        return m;
    } 
}
