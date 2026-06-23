class Solution:
    def encode(self, strs: list[str]) -> str:
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s
        return res

    def decode(self, s: str) -> list[str]:
        res = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "#":
                j += 1
            length = int(s[i:j])
            start = j + 1
            res.append(s[start:start + length])
            i = start + length
        return res

# usage
strs=["",""]
s = Solution()
encoded = s.encode(strs)
decoded = s.decode(encoded)

print(encoded)
print(decoded)
