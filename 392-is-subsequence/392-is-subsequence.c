

bool isSubsequence(char * s, char * t){
    if(strlen(s) == 0)
        return true;
    if(strlen(s) > strlen(t))
        return false;
    
    int flag = -1, p = 0, l = strlen(s);
    char *n = (char *)malloc(l * sizeof(char));
        for(int j = 0; j < strlen(t); j++){
            if(s[p] == t[j]){
                n[p] = t[j];
                p++;
            }
        }
    for(int i = 0; i < l; i++){
        if(n[i] == s[i]){
            flag = 0;
        }
        else
            flag = -1;
    }
    return (flag == 0);
}