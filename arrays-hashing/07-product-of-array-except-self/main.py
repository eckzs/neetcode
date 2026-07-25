from collections import defaultdict
import math

class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        output = []
        for idx, n in enumerate(nums):
            delta_x = math.prod(nums[:idx] + nums[idx+1:])
            output.append(delta_x)
        return output

if __name__ == "__main__":
    nums = [1, 2, 4, 6]

    # Output: [48,24,12,8]
    s = Solution()
    print(s.productExceptSelf(nums))