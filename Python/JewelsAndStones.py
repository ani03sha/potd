"""
Given a string representing your stones and another string representing a list of jewels, 
return the number of stones that you have that are also jewels.
"""


class JewelsAndStones:
    def numJewelsInStones(self, J: str, S: str) -> int:
        if J is None or len(J) == 0 or S is None or len(S) == 0:
            return 0
        count = 0
        for c in S:
            if c in J:
                count += 1
        return count


if __name__ == "__main__":
    j = JewelsAndStones()
    print(j.numJewelsInStones("aA", "aAAbbbb"))
    print(j.numJewelsInStones("z", "ZZ"))
