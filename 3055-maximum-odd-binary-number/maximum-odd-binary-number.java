class Solution {
    public String maximumOddBinaryNumber(String s) {
        int index = s.indexOf('1');
        int l = s.length();
        String sx = "";
        if(s.indexOf('1', index) == -1){
            for(int i = 1; i < l; i++)
                sx+= '0';
            sx += '1';
        }
        else{
            int oneCount = 0;
            for(int i = 0; i < l; i++)
                if(s.charAt(i) == '1')
                    oneCount++;
            for(int i = 0; i < l-1;i++){
                if(oneCount > 1){
                    sx += '1';
                    oneCount--;
                }
                else
                    sx += '0';
            }
            sx+= '1';
        }
        return sx;
    }
}