"""
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
"""


class DetectCapitalization:
    def detect(self, word: str) -> bool:
        if word[1:].lower() == word[1:]:
            return True

        if word.isupper():
            return True

        return False


if __name__ == "__main__":
    d = DetectCapitalization()
    print(d.detect("Anirudh"))
    print(d.detect("USA"))
    print(d.detect("redquark"))
    print(d.detect("FlaG"))
    print(d.detect("inCorrect"))
