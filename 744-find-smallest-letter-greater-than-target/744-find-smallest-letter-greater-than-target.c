

char nextGreatestLetter(char* letters, int lettersSize, char target){
    char min = letters[0];
    for(int i = 1; i < lettersSize; i++){
        if(letters[i] < min)
            min = letters[i];
    }
    if(min > target)
        return min;
    else{
        for(int i = 0; i < lettersSize; i++){
            if(letters[i] > min && letters[i] > target)
                return letters[i];
        }
    }
    return min;
}