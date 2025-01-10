class Solution {
    public int romanToInt(String s) {
        ArrayList<String> roman = new ArrayList<String>();
        roman.add("I");
        roman.add("V");
        roman.add("X");
        roman.add("L");
        roman.add("C");
        roman.add("D");
        roman.add("M");
        int[] values = { 1, 5, 10, 50, 100, 500, 1000 };
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = roman.indexOf(s.substring(i, i + 1));
            if (i < s.length() - 1) {
                int nextIndex = roman.indexOf(s.substring(i + 1, i + 2));
                if (nextIndex > index) {
                    result += values[nextIndex] - values[index];
                    i++;
                } else {
                    result += values[index];
                }
            } else {
                result += values[index];
            }
        }
        return result;
    }
}