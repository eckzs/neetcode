import unittest

from main import group_anagrams


def normalize(groups: list[list[str]]) -> list[tuple[str, ...]]:
    return sorted(tuple(sorted(g)) for g in groups)


class TestGroupAnagrams(unittest.TestCase):
    def test_example_1(self):
        result = group_anagrams(["act", "pots", "tops", "cat", "stop", "hat"])
        expected = [["hat"], ["act", "cat"], ["stop", "pots", "tops"]]
        self.assertEqual(normalize(result), normalize(expected))

    def test_example_2(self):
        result = group_anagrams(["x"])
        expected = [["x"]]
        self.assertEqual(normalize(result), normalize(expected))

    def test_example_3(self):
        result = group_anagrams([""])
        expected = [[""]]
        self.assertEqual(normalize(result), normalize(expected))


if __name__ == "__main__":
    unittest.main()
