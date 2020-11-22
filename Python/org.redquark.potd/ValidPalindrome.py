class ValidPalindrome:
    def isPalindrome(self, s):
        # Base condition
        if s == None and len(s) == 0:
            return False
        # Remove all special characters and whitespace
        s = s.replace("[^a-zA-Z]", "")
        # Convert all the characters in the string to one case only
        s = s.lower()
        # Two pointers
        left = 0
        right = len(s) - 1
        # Loop until the two pointers meet
        while left <= right:
            if s[left] is not s[right]:
                return False
            left += 1
            right -= 1
        return True


if __name__ == "__main__":
    validPalindrome = ValidPalindrome()
    print(validPalindrome.isPalindrome("level"))
    print(validPalindrome.isPalindrome("algorithms"))
    print(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
