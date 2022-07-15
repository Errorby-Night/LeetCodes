#include <string.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int reallen(char * s){
    int l = strlen(s);
    int k = 0;
    for(int i = 0; i < l; i++){
        if((s[i] >= 65 && s[i] <= 90) || (s[i] >= 97 && s[i] <= 122) || (s[i] >= 48 && s[i] <= 57))
            k++;
    }
    return k;
}
char* refine(char * s){
    int l = reallen(s);
    int k = 0;
    char *a = (char *)malloc(l * sizeof(char));
    for(int i = 0; i < strlen(s); i++){
        if((s[i] >= 65 && s[i] <= 90) || (s[i] >= 97 && s[i] <= 122) || (s[i] >= 48 && s[i] <= 57))
            a[k++] = s[i];
    }
    return a;
}
bool isPalindrome(char * s){
    for(int i = 0; i < strlen(s); i++){
        s[i] = tolower(s[i]);
    }
    int l = reallen(s);
    int c = l;
    bool flag = true;
    char *ans = (char *)malloc(l * sizeof(char));
    ans = refine(s);
    for(int i = 0; i < l; i++){
        if(ans[i] != ans[--c]){
            flag = false;
            break;
        }
    }
    return flag;
}