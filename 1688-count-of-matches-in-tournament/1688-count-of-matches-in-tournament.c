

int numberOfMatches(int n){
    int nom = 0, i = n;
    while(i>1){
        if(i%2==0){
            i = i/2;
            nom+=i;
        }
        else{
            i = (i-1)/2+1;
            nom+=(i-1);
        }
    }
    return nom;
}