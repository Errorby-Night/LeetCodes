class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        bulls = 0
        cows = 0
        secret_dict  = {}
        guess_dict  = {}
        
        for i, j in zip(secret, guess):
            if i == j:
                bulls += 1
            else:
                secret_dict[i] = secret_dict.get(i, 0) + 1
                guess_dict[j] = guess_dict.get(j, 0) + 1
        for i in secret_dict:
            if i in guess_dict:
                cows += min(secret_dict[i], guess_dict[i])
        return f"{bulls}A{cows}B"