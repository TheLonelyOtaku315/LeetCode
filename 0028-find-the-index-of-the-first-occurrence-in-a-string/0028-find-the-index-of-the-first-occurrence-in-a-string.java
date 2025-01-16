class Solution {
    public int strStr(String haystack, String needle) {
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();

        int size = needle.length();

        for (int i = 0; i <= haystackChar.length - size; i++) {
            boolean answer = true;
            for (int j = 0; j < size; j++) {
                if (haystackChar[i + j] != needleChar[j]) {
                    answer = false;
                    break;
                }
            }
            if (answer) {
                return i;
            }
        }
        return -1;
    }
}