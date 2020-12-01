"""
Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters.
"""
from typing import List


class LongestCommonPrefix:
    def longestCommonPrefix(self, a: List[str]) -> str:
        # Longest common prefix string
        lcp = ""
        # Base condition
        if a is None or len(a) == 0:
            return lcp
        # Find the minimum length string from the array
        minimumLength = len(a[0])
        for i in range(1, len(a)):
            minimumLength = min(minimumLength, len(a[i]))
        # Loop until the minimum length
        for i in range(0, minimumLength):
            # Get the current character from the first string
            current = a[0][i]
            # Check if this character is found in all other strings or not
            for j in range(0, len(a)):
                if a[j][i] != current:
                    return lcp
            lcp += current
        return lcp


if __name__ == '__main__':
    l = LongestCommonPrefix()
    print(l.longestCommonPrefix(["flower", "flow", "flight"]))
    print(l.longestCommonPrefix(["dog", "racecar", "car"]))
    print(l.longestCommonPrefix(
        ["electric", "elephant", "elevator", "element"]))
