class Solution {
    public int compress(char[] chars) {
        int anchor = 0;
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < chars.length; readIndex++) {
            if (readIndex + 1 == chars.length || chars[readIndex + 1] != chars[readIndex]) {
                chars[writeIndex++] = chars[anchor];
                if (readIndex > anchor) {
                    for (char c : ("" + (readIndex - anchor + 1)).toCharArray()) {
                        chars[writeIndex++] = c;
                    }
                }
                anchor = readIndex + 1;
            }
        }
        return writeIndex;
    }
}
