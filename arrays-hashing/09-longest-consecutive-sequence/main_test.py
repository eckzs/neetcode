import unittest

from main import Solution


class TestLongestConsecutive(unittest.TestCase):
    def test_example_1(self):
        result = Solution().longestConsecutive([2, 20, 4, 10, 3, 4, 5])
        self.assertEqual(result, 4)

    def test_example_2(self):
        result = Solution().longestConsecutive([0, 3, 2, 5, 4, 6, 1, 1])
        self.assertEqual(result, 7)


if __name__ == "__main__":
    unittest.main()
