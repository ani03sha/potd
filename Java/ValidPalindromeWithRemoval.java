/**
 * Given a non-empty string s, you may delete at most one character. Judge
 * whether you can make it a palindrome.
 */
public class ValidPalindromeWithRemoval {

    private static boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, 0);
    }

    private static boolean validPalindrome(String s, int left, int right, int count) {
        // If the removed character count is greater than 1 then return false
        if (count > 1) {
            return false;
        }
        // Loop until the two pointers meet
        while (left < right) {
            // If the characters are same, then we will proceed
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } 
            // If the characters are different, we will check the validity for
            // substrings after incrementing count to 1.
            else {
                return validPalindrome(s, left + 1, right, count + 1) || validPalindrome(s, left, right - 1, count + 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abcba"));
        System.out.println(validPalindrome("foobof"));
        System.out.println(validPalindrome("abccab"));
        System.out.println(validPalindrome("abc"));
    }
}
