class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() == 1)
            return false;
        char[] bra = new char[s.length()];
        int k = -1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                bra[++k] = c;
            else{
                if(k >= 0){
                    switch(c){
                        case ')':
                            if(bra[k] == '{' || bra[k] ==  '[')
                                return false;
                            break;
                        case '}':
                            if(bra[k] == '(' || bra[k] ==  '[')
                                return false;
                            break;
                        case ']':
                            if(bra[k] == '{' || bra[k] ==  '(')
                                return false;
                            break;
                    }
                    k--;
                }else{return false;}
            }
        }
        return  k == -1;
    }
}