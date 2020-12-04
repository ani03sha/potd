"""
Given two strings s and t return whether or not s is an anagram of t.
Note: An anagram is a word formed by reordering the letters of another word.
"""


class ValidAnagram:
    def isAnagram(self, s: str, t: str) -> bool:
        # Base condition
        if len(s) != len(t):
            return False
        # Counter for character frequencies
        counter = {}
        # Loop for eac character in the string
        for i in range(len(s)):
            if s[i] in counter:
                counter[s[i]] += 1
            else:
                counter[s[i]] = 1
            if t[i] not in counter:
                counter[t[i]] = 0
            counter[t[i]] -= 1
        # Check if there is character whose count is non-zero
        for key, value in counter.items():
            if value != 0:
                return False
        return True


if __name__ == "__main__":
    v = ValidAnagram()
    print(v.isAnagram("aa", "bb"))
    print(v.isAnagram("anagram", "nagaram"))
    print(v.isAnagram("rat", "car"))
