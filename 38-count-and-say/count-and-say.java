class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String s = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length();) {
            int count = 1;
            int j = i + 1;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }
            result.append(count).append(s.charAt(i));
            i = j;
        }
        return result.toString();
    }
}
