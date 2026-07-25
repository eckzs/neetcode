import unittest

from main import Solution


class TestProductExceptSelf(unittest.TestCase):
    def test_example_1(self):
        sol = Solution()
        self.assertEqual(sol.productExceptSelf([1, 2, 4, 6]), [48, 24, 12, 8])

    def test_example_2(self):
        sol = Solution()
        self.assertEqual(sol.productExceptSelf([-1, 0, 1, 2, 3]), [0, -6, 0, 0, 0])


if __name__ == "__main__":
    unittest.main()
