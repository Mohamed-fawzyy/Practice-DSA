class Solution(object):
    def isPalindrome(self, s):
        
        if s is None or s == " ":
            return True

        clean_string = ''.join(char for char in s.lower() if char.isalnum())
        palindrom = clean_string[::-1]
        
        if clean_string != palindrom:
            return False
        return True