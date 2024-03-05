class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                char target = s.charAt(left);
                while (left <= right && s.charAt(left) == target) {
                    left++;
                }
                while (left <= right && s.charAt(right) == target) {
                    right--;
                }
            } else {
                break;
            }
        }
        return right - left + 1;
    }
}
