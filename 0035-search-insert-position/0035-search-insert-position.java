class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i : nums) {
            if (i == target) {
                return index;
            }else if (i > target) {
                return index;
            }else if (index == nums.length - 1) {
                return index + 1;
            }
            index++;
        }
        return 0;
    }
}