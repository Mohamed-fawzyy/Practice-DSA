class Solution(object):
    def isPalindrome(self, x):
        num = x
        rev_num = 0

        while x != 0 and x > 0:
            digit = x % 10
            rev_num = rev_num * 10 + digit
            x = x // 10

        print(rev_num)
        if num == rev_num:
            return True
        else:
            return False