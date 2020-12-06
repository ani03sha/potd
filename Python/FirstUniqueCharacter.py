"""
Given a string, return the index of its first unique character. 
If a unique character does not exist, return -1.
"""


class FirstUniqueCharacter:
    def firstUniqChar(self, s: str) -> int:
        # Base condition
        if s == None or len(s) == 0:
            return -1;
        # This dictionary will store the count of every character in the string
        # Assuming the string contains only lowercase english characters,
        # there will only be 26 different characters to consider.
        frequencies = {}
        # Loop through the string character by character
        for c in s:
            if frequencies.get(c):
                frequencies[c] += 1
            else:
                frequencies[c] = 1
        # Now again loop through the string and return as soon as the character
        # with frequency equals to 1 is found
        for i in range(len(s)):
            if frequencies[s[i]] == 1:
                return i
        return - 1


if __name__ == "__main__":
    f = FirstUniqueCharacter()
    print(f.firstUniqChar("developer"))
    print(f.firstUniqChar("abcabd"))
    print(f.firstUniqChar("aabbccdd"))
