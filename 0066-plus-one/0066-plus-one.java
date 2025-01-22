class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length; i > 0; i--) {
            if (digits[i - 1] == 9) {
                digits[i - 1] = 0;
            } else {
                digits[i - 1] = digits[i - 1] + 1;
                break;
            }

        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }
}