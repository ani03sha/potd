/**
 * Given a non-empty string s, you may delete at most one character. Judge
 * whether you can make it a palindrome.
 */
const validPalindrome = (s) => {
    return valid(s, 0, s.length - 1, 0);
};

const valid = (s, left, right, count) => {
    // If the removed character count is greater than 1 then return false
    if (count > 1) {
        return false;
    }
    // Loop until the two pointers meet
    while (left < right) {
        // If the characters are same, then we will proceed
        if (s[left] === s[right]) {
            left++;
            right--;
        }
        // If the characters are different, we will check the validity for
        // substrings after incrementing count to 1.
        else {
            return valid(s, left + 1, right, count + 1) || valid(s, left, right - 1, count + 1);
        }
    }
    return true;
};

console.log(validPalindrome("aba"));
console.log(validPalindrome("abca"));
console.log(validPalindrome("abcba"));
console.log(validPalindrome("foobof"));
console.log(validPalindrome("abccab"));
console.log(validPalindrome("abc"));