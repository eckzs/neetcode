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



if __name__ == "__main__":
    nums = [2, 20, 4, 10, 3, 4, 5]
    case2 = [0, 3, 2, 5, 4, 6, 1, 1]
    s = Solution()
    print(s.longestConsecutive(nums))
    # Output: 4
    print(s.longestConsecutive(case2))
    # Output: 7
