class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        rtype=[]
        for ind in range(0,len(nums)):
            for i in range(ind+1,len(nums)):
                if(nums[ind]+nums[i]==target):
                    rtype.append(ind)
                    rtype.append(i)
                    break
                else:
                    continue
        return rtype