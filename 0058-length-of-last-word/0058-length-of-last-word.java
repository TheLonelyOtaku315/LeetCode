class Solution {
    public int lengthOfLastWord(String s) {
        String regex = "[,\\s\\.]";
        String[] words = s.split(regex);

        return words[words.length - 1].length();
    }
}