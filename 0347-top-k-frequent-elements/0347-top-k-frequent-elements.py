class Solution(object):
    def topKFrequent(self, nums, k):
        if len(nums) == 1:
            return nums
        #solve it by bucket sort
        freq = [[] for i in range(len(nums) + 1)]
        # print(freq)

        #create our {} to count the numbers
        counter = {}
        for n in nums:
            counter[n] = 1 + counter.get(n, 0)
        
        # start adding our counts for each number inside the freq depends on the index
        for number, count in counter.items():
            freq[count].append(number)
            # print(freq)
        
        result = [] #start from last i, stop at 0, decrement by 1
        for i in range(len(freq) -1, 0, -1):
            for n in freq[i]:
                result.append(n)
                if len(result) == k:
                    return result
        