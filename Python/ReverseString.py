from typing import List


class ReverseString:
    def reverseString(self, s: List[str]) -> List:
        # Reversed string
        reversedString = ""
        # Loop for all characters in the string
        for i in s:
            reversedString = i + reversedString
        return reversedString


if __name__ == "__main__":
    r = ReverseString()
    print(r.reverseString("Cat"))
    print(r.reverseString("Program of the day"))
    print(r.reverseString("red quark"))
    print(r.reverseString("level"))
    print(r.reverseString(""))
    
