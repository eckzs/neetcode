from collections import defaultdict


strs = ["act","pots","tops","cat","stop","hat"]

def group_anagrams(strs: list[int]) -> list[list[int]]:
    anagram_groups = defaultdict(list)
    # {abc: [0, 4, 5]}
    for stri in strs:
        sorted_key = "".join(sorted(stri))
        anagram_groups[sorted_key].append(stri)

    return list(anagram_groups.values())

# Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

print(group_anagrams(strs))
