class Solution(object):
    def longestConsecutive(self, nums):
        
        nums = set(nums)
        longest = 0

        for n in nums:
            # check if this number is start of sequence if it not exist so its yes
            if (n -1) not in nums:
                length = 0
                while (n + length) in nums:
                    length += 1
                longest = max(length, longest) #this check bet the current len and the prev one
        return longest
        