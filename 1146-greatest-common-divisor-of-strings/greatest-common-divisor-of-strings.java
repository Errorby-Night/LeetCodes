class Solution {
    public int gcd(int x, int y){
        int result = Math.min(x, y);
        while(result > 0){
            if(x % result == 0 && y % result == 0)
                break;
            result--;
        }
        return result;
    }
    public String gcdOfStrings(String str1, String str2) {
        if((str1 + str2).equals(str2 + str1)){
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }
        return "";
    }
}