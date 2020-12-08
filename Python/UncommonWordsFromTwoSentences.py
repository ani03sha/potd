"""
Given two strings representing sentences, return the words that are not common to both strings 
(i.e. the words that only appear in one of the sentences). You may assume that each sentence is 
a sequence of words (without punctuation) correctly separated using space characters.
"""
from typing import List


class UncommonWordsFromTwoSentences:
    def uncommonFromSentences(self, A: str, B: str) -> List[str]:
        AB = (A + " " + B).split()
        unique = {}
        for i in range(len(AB)):
            if AB[i] in unique:
                unique[AB[i]] = unique[AB[i]] + 1
            else:
                unique[AB[i]] = 1
        return [word for word in unique if unique[word] == 1]


if __name__ == "__main__":
    u = UncommonWordsFromTwoSentences()
    print(u.uncommonFromSentences("this apple is sweet", "this apple is sour"))
    print(u.uncommonFromSentences("apple apple", "banana"))
