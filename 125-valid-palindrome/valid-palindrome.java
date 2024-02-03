class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() ==  1)
            return true;
        s = s.toLowerCase();
        String news = "";
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - 'a' >= 0  && s.charAt(i) - 'a'< 25) || (s.charAt(i) -'0' >= 0 && s.charAt(i) - '0' <= 9))
                news += s.charAt(i);
        }
        int i = 0, j = news.length() - 1;
        while(i <= j){
            if(news.charAt(i)  != news.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
}