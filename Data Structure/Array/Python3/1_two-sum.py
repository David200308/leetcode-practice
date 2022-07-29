class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        n = 0
        for i in range(0, len(nums)):
            for j in range(i, len(nums)):
                a = nums[i]
                b = nums[j]
                if a + b == target and i != j:
                    answer = [i, j]
                    return answer