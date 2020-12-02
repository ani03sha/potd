"""
Given a non-empty string s, you may delete at most one character. Judge
whether you can make it a palindrome.
"""


class ValidPalindromeWithRemoval:
    def valid(self, s, left, right, count):
        # If the removed character count is greater than 1 then return false
        if count > 1:
            return False
        # Loop until the two pointers meet
        while left < right:
            # If the characters are same, then we will proceed
            if s[left] == s[right]:
                left += 1
                right -= 1
            # If the characters are different, we will check the validity for
            # substrings after incrementing count to 1.
            else:
                return self.valid(s, left + 1, right, count + 1) or self.valid(s, left, right - 1, count + 1)
        return True

    def validPalindrome(self, s: str) -> bool:
        return self.valid(s, 0, len(s) - 1, 0)


if __name__ == "__main__":
    v = ValidPalindromeWithRemoval()
    print(v.validPalindrome("aba"))
    print(v.validPalindrome("abca"))
    print(v.validPalindrome("abcba"))
    print(v.validPalindrome("foobof"))
    print(v.validPalindrome("abccab"))
    print(v.validPalindrome("abc"))
