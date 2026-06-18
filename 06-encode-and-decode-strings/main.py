class Solution:
    def encode(self, strs: list[str]) -> str:
        # validar que si hay [""] -> retornamos solo "" luego -> [""]
        if len(strs) == 0:
            return ""
        return " ".join(strs)
    
    def decode(self, s: str) -> list[str]:
        return s.split()

# usage
strs=["",""]
s = Solution()
encoded = s.encode(strs)
decoded = s.decode(encoded)

print(encoded)
print(decoded)
