char* defangIPaddr(char* address) {
    int numberOfDots = 0;
    int numberOfChars = 0;

    for (int i = 0; address[i] != '\0'; i++) {
        if (address[i] == '.') numberOfDots++;
        else numberOfChars++;
    }

    int dotsAndBrackets = numberOfDots * 3;

    char* returnStr = malloc(numberOfChars + dotsAndBrackets + 1);
    returnStr[numberOfChars + dotsAndBrackets] = '\0';
    
    int j = 0;
    for (int i = 0; address[i] != '\0'; i++) {
        if (address[i] == '.') {
            returnStr[j] = '[';
            returnStr[++j] = '.';
            returnStr[++j] = ']';
        }
        else returnStr[j] = address[i];

        j++;
    }

    return returnStr;
}