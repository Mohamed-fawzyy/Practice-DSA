class Solution(object):
    def isValid(self, s):
        stack = []
        lookup = {')': '(', ']': '[', '}': '{'}

        if not s:
            return False

        for i in s:
            if i in lookup.values():
                stack.append(i)
            elif stack and lookup[i] == stack[-1]:
                stack.pop()
            else:
                return False
            
        return stack == []
        