"""
Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
"""
import re


class ValidPalindrome:
    def isPalindrome(self, s: str) -> bool:
        # Base condition
        if s == None or len(s) == 0:
            return True
        # Remove all special characters and whitespace
        s = ''.join(e for e in s if e.isalnum())
        # Convert all the characters in the string to one case only
        s = s.lower()
        # Two pointers
        left = 0
        right = len(s) - 1
        # Loop until the two pointers meet
        while left <= right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True


if __name__ == "__main__":
    validPalindrome = ValidPalindrome()
    print(validPalindrome.isPalindrome("level"))
    print(validPalindrome.isPalindrome("algorithms"))
    print(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
