import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArr {
    public static void main(String[] args) {
        // int[] arr1={1,2,2,1};
        // int[]arr2={2,2};
        int[]arr3={4,9,5};
        int[]arr4={9,4,9,8,4};


        System.out.println(Arrays.toString(intersection(arr3, arr4)));
    }

    static int[] intersection(int[] nums1, int[] nums2){

        // int len=(nums1.length+nums2.length)/2;
        // int[] temp=new int[len];
        
        // List<Integer> ans = new ArrayList<>();

        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if(nums1[i]==nums2[j]){
        //             ans.add(nums2[j]);
        //             break;
        //         }
        //     }
        // }

        // int[]res=ans.stream().mapToInt(i->i).toArray();

        // return res;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>(); // To store unique values

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !uniqueElements.contains(nums2[j])) { // Ensuring uniqueness
                    ans.add(nums2[j]);
                    uniqueElements.add(nums2[j]); // Mark as added
                    break;
                }
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();

    }
}
