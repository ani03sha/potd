/**
 * Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
 * Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
 */
class ValidPalindrome {

    isValid(s) {
        // Base condition
        if (s == undefined || s.length == 0) {
            return false;
        }
        // Remove all special characters and whitespace
        s = s.replace("[^a-zA-Z]/g", "");
        // Convert all the characters in the string to one case only
        s = s.toLowerCase();
        // Two pointers
        let left = 0;
        let right = s.length - 1;
        // Loop until the two pointers meet
        while (left <= right) {
            if (s[left] != s[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

let validPalindrome = new ValidPalindrome();
console.log(validPalindrome.isValid("level"));
console.log(validPalindrome.isValid("algorithms"));
console.log(validPalindrome.isValid("A man, a plan, a canal: Panama"));