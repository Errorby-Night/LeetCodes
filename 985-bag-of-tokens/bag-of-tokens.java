class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int max_score = 0;
        int left = 0, right = tokens.length - 1;
        Arrays.sort(tokens);
        while(left <= right){
            if(power >= tokens[left]){
                power-=tokens[left];
                score++;
                left++;
                max_score = Math.max(max_score, score);
            }
            else if(score >= 1){
                power += tokens[right];
                score--;
                right--;
            }
            else
                break;
        }
        return max_score;
    }
}