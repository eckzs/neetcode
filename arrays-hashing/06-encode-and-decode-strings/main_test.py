import unittest

from main import Solution


class TestEncodeDecode(unittest.TestCase):
    def test_example_1(self):
        sol = Solution()
        strs = ["Hello", "World"]
        self.assertEqual(sol.decode(sol.encode(strs)), strs)

    def test_example_2(self):
        sol = Solution()
        strs = [""]
        self.assertEqual(sol.decode(sol.encode(strs)), strs)


if __name__ == "__main__":
    unittest.main()
