class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        x = word.find(ch)
        if x == -1:
            return word
        w = word[0 : (x + 1)]
        w = w[::-1]
        neww = w + word[(x + 1): ]
        return neww