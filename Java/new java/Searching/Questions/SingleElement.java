public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
    //     for (int i = 0; i < nums.length-1; i++) {
    //         if (nums.length == 1) {
    //             return nums[i];
    //         } else if (nums[i] == nums[i + 1]) {
    //             i++;
    //         } else {
    //             return nums[i];
    //         }
    //     }

    //     return 1;
    // }

    for (int i = 0; i < nums.length; i++) {
        // If it's the last element or it's not equal to the next one, return it
        if ((i == nums.length - 1) || (nums[i] != nums[i + 1])) {
            return nums[i];
        }
        i++; // Skip the next duplicate element
    }
    return -1; // Should never reach here
}

}
