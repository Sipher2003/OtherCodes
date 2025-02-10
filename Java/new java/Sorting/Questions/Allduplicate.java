import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Allduplicate {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // duplicatenums(nums);
        System.out.println(duplicatenums(nums));

    }

    static List<Integer> duplicatenums(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int corrind = nums[i] - 1;
            if (nums[i] != nums[corrind]) {
                int temp = nums[i];
                nums[i] = nums[corrind];
                nums[corrind] = temp;
            } else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if (j != (nums[j] - 1)) {
                ans.add(nums[j]);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
