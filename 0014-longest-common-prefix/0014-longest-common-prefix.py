class Solution(object):
    def longestCommonPrefix(self, strs):
        min_length = min(map(len, strs))

        if not strs:
            return ''
        
        res = ''
        for i in range(min_length):
            add = strs[0][i]
            for j in range(1, len(strs)):
                if strs[j][i] != add:
                    return res
                
            res += add
        return res
        