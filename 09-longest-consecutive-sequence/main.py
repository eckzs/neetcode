class Solution:
   def longestConsecutive(self, nums: list[int]) -> int:
        if not nums:
            return 0

        sorted_nums = sorted(set(nums))
        longest = 1
        tmp = 1

        for i in range(len(sorted_nums) - 1):
            if sorted_nums[i] + 1 == sorted_nums[i + 1]:
                tmp += 1
            else:
                longest = max(longest, tmp)
                tmp = 1

        return max(longest, tmp)


        
nums = [2,20,4,10,3,4,5]
case2 = [0,3,2,5,4,6,1,1]
# 2, 3, 4, 4, 5, 10, 20
s = Solution()
print(s.longestConsecutive(case2))
# Output: 4