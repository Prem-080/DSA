class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = []
        seen = {}
        for i, e in enumerate(nums):
            diff = target - e
            if diff in seen:
                res.append(i)
                res.append(seen.get(diff))
                break
            seen[e] = i

        return res

        
