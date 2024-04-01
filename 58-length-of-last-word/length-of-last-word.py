class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        x = s.split(" ")
        return len(x[-1])