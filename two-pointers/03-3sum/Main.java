
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        // -4, -1, -1, 0, 1, 2
        Solution sol = new Solution();
        List<List<Integer>> result = sol.threeSum(nums);
        System.out.println(result);
        // Output: [[-1,-1,2],[-1,0,1]]
    }

}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                int result = nums[i] + nums[left] + nums[right];

                if(result == 0){
                    out.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (result < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return out;
    }
}
