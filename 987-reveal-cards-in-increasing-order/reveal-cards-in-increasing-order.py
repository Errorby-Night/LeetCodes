class Solution:
    def deckRevealedIncreasing(self, deck):
        # Sort the deck in increasing order
        deck.sort()
        
        n = len(deck)
        result = [0] * n
        indices = deque(range(n))
        
        for card in deck:
            idx = indices.popleft()
            result[idx] = card
            if indices:
                indices.append(indices.popleft())
        
        return result