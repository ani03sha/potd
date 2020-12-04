import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t return whether or not s is an anagram of t. Note:
 * An anagram is a word formed by reordering the letters of another word.
 */
public class ValidAnagram {
    
    private static boolean isAnagram(String s, String t) {
        // Base condition
        if (s.length() != t.length()) {
            return false;
        }
        // Map to store character frequencies
        Map<Character, Integer> counter = new HashMap<>();
        // Loop for each character in the string
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
            counter.put(t.charAt(i), counter.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aa", "bb"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}