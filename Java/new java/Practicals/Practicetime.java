public class Practicetime {
    
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        // System.out.println(LinSrch(arr, 8));
        // System.out.println(binsrch(arr, 6));
        System.out.println(recbinsrch(arr, 6,0,arr.length-1));
    }


    static int binsrch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{

                return mid;
            }
        }
        
        return 0;
    }

    static int recbinsrch(int [] arr,int tar,int s,int e){
        
        // int s=0;
        // int e=arr.length-1;
        if(s>e){
            return -1;
        }

            int m=s+(e-s)/2;

            if(tar <arr[m]){
                return recbinsrch(arr,tar,0,m-1);
            }
            if(tar>arr[m]){
                return recbinsrch(arr, tar, m+1, e);
            }
            return m;
        
        
    }





    static int LinSrch(int[] arr, int target){
        
    for (int i = 0; i < arr.length; i++) {
        
        if(arr[i]==target){
            return i;
        }
    }
        
        return 0;
    }
}
