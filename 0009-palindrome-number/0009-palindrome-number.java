class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String number = Integer.toString(x);
        int start = 0, end = number.length() - 1;

        while (start < end) {
            if (number.charAt(start) != number.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}