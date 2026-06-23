
public class Main {
    public static void main(String[] args){
        int[] height = new int[]{1,7,2,5,4,7,3,6};

        Solution sol = new Solution();
        int result = sol.maxArea(height);

        System.out.println(result);
        // Output: 36
    }
    
}

class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right){
            int minBarHeight = (heights[left] < heights[right]) ? heights[left] : heights[right];
            int widthBetweenBars = right - left;
            int area = minBarHeight * widthBetweenBars;
            if (area > maxArea){
                maxArea = area;
            }
            left++;
        }
        return maxArea;
    }
}

