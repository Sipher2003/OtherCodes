import java.util.Arrays;

public class LinSrch {
    public static void main(String[] args) {
int[] arr={1,2,3,4,5};
 int[][] arr2 = {
                { 11, 33, 44 },
                { 22, 45, 67 },
                { 89, 91 },
                { 26, 31, 42, 74 }
        };
        // System.out.println(linsrch(arr, 3));
        System.out.println(Arrays.toString(linsrch2d(arr2, 42)));
    }

    static int linsrch(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        
        return -1;
    }

    static int[] linsrch2d(int[][] nums,int target){
     
        
        for (int rows = 0; rows < nums.length; rows++) {
            for (int cols = 0; cols < nums[rows].length; cols++) {
                if(nums[rows][cols]==target){
                    return new int[]{rows,cols};
            }
            }
        }
        return new int[]{-1,-1};
    }
}
