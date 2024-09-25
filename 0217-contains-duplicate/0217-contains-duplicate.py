class Solution(object):
    def containsDuplicate(self, nums):
        repeated = set()
        for element in nums:
            if element in repeated:
                return True
            repeated.add(element)
        return False        