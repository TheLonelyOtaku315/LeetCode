class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        for (size_t i = 0; i <= nums.size(); i++)
        {

            if (nums.at(i) == target)
            {
                return i;
            }
            else if (nums.at(i) > target)
            {
                return i;
            }
            else if (i == nums.size() - 1)
            {
                return i + 1;
            }
        }
        return 0;
    }
};