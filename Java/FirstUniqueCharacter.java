/**
 * Given a string, return the index of its first unique character. If a unique
 * character does not exist, return -1.
 */
public class FirstUniqueCharacter {
    
    private static int firstUniqChar(String s) {
        // Base conditions
        if (s == null || s.isEmpty()) {
            return -1;
        }
        // This array will store the count of every character in the string
        // Assuming the string contains only lowercase english characters,
        // there will only be 26 different characters to consider.
        int[] frequencies = new int[26];
        // Loop through the string character by character
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        // Now again loop through the string and return as soon as the character
        // with frequency equals to 1 is found
        for (int i = 0; i < s.length(); i++) {
            if (frequencies[s.charAt(i)- 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("developer"));
        System.out.println(firstUniqChar("abcabd"));
        System.out.println(firstUniqChar("aabbccddee"));
    }
}