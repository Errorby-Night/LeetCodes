class Solution {
    public String removeStars(String s) {
        int p = s.indexOf('*');
        String sx = "";
        char chars[] = new char[s.length()];
        int k = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '*')
                chars[++k] = s.charAt(i);
            else{
                if(k >= 0)
                    chars[k--] = ' ';
            }
        }
        for(int i = 0; i < s.length(); i++)
            if(chars[i] != ' ' && chars[i] != '\u0000')
                sx+=chars[i];
        return sx;
    }
}