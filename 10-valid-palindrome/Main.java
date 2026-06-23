public class Main {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(s);

        System.out.println(result);
    }
}

class Solution {
    // public boolean isPalindrome(String s) {
    //     String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    //     int left = 0;
    //     int right = str.length() - 1;
    //     while (left < right) {
    //         if (str.charAt(left) != str.charAt(right)){
    //             System.out.println(str.charAt(left) + " != "+ str.charAt(right));
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
    
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
