public class Main {
    public static void main(String[] args) {
        int[] height = new int[] { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };

        Solution sol = new Solution();
        int result = sol.trap(height);

        System.out.println(result);
        // Output: 9
    }
}

class Solution {
    public int trap(int[] height) {
        // can I sum the negative space that remains between bars?
        // left to right check, keep adding to out, because if lBar is shorter than
        // rBar, is ease, but if lBar > rBar we need to substract remaing to avoid
        // overflow
        int left = 0;
        int right = height.length - 1;

        int area = 0;
        boolean outsideLeft = false;
        boolean outsideRight = false;

        while (left < right) {
            if (outsideLeft == true && outsideRight == true) {
                area = height[left] - height[left + 1];
                left++;
            }
            // iterate until inside side
            // inner has to be less than the outside
            while (height[left] < height[left + 1]) {
                left++;
            }
            outsideLeft = true;
            while (height[right] < height[right - 1]) {
                right--;
            }
            outsideRight = true;
            // then start

        }

        return 0;
    }
}
