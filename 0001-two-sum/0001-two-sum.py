class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer = []
        for x in range(len(nums)):
            for y in range(x + 1, len(nums)):
                if nums[x] + nums[y] == target:
                    answer.append(x)
                    answer.append(y)
        return answer
