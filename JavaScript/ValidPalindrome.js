class ValidPalindrome {

    isValid(s) {
        // Base condition
        if (s == undefined || s.length == 0) {
            return true;
        }
        // Remove all special characters and whitespace
        s = s.replace(/[^a-zA-Z0-9]/g, "");
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
console.log(validPalindrome.isValid("0P"));