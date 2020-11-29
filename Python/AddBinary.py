"""
Given two binary strings a and b, return their sum as a binary string.
Constraints:

1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
"""


class AddBinary:
    def addBinary(self, a: str, b: str) -> str:
        # Resultant string
        result = ""
        # Indices for a and b
        aCount = len(a) - 1
        bCount = len(b) - 1
        # Carry
        carry = 0
        # Loop for all the characters in the strings
        while aCount >= 0 or bCount >= 0:
            # Sum of two bits
            totalSum = carry
            if aCount >= 0:
                totalSum += int(a[aCount])
                aCount -= 1
            if bCount >= 0:
                totalSum += int(b[bCount])
                bCount -= 1
            # Add the bit to te result
            result = str(totalSum % 2) + result
            # Modify carry
            carry = totalSum // 2
        # Final check if carry exists
        if carry > 0:
            result = str(1) + result
        return result


if __name__ == "__main__":
    a = AddBinary()
    print(a.addBinary("11", "1"))
    print(a.addBinary("1010", "1011"))
