from collections import defaultdict


def group_anagrams(strs: list[str]) -> list[list[str]]:
    anagram_groups = defaultdict(list)
    # {abc: [0, 4, 5]}
    for stri in strs:
        sorted_key = "".join(sorted(stri))
        anagram_groups[sorted_key].append(stri)

    return list(anagram_groups.values())


if __name__ == "__main__":
    strs = ["act", "pots", "tops", "cat", "stop", "hat"]
    # Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
    print(group_anagrams(strs))
