/**
 * Given an array of strings, return the longest common prefix that is shared
 * amongst all strings. Note: you may assume all strings only contain lowercase
 * alphabetical characters.
 */
public class LongestCommonPrefix {

    private static String longestCommonPrefix(String[] a) {
        // This variable will store the longest common prefix
        StringBuilder lcp = new StringBuilder();
        // Base condition
        if (a == null || a.length == 0) {
            return lcp.toString();
        }
        // Find the length of the shortest string in the array
        int minimumLength = a[0].length();
        for (int i = 1; i < a.length; i++) {
            minimumLength = Math.min(minimumLength, a[i].length());
        }
        // Loop until the minimum length
        for (int i = 0; i < minimumLength; i++) {
            // Get the current character from the first string
            char c = a[0].charAt(i);
            // Check if this character is present in all the other strings
            for (String s : a) {
                if (s.charAt(i) != c) {
                    return lcp.toString();
                }
            }
            lcp.append(c);
        }
        return lcp.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
        System.out.println(longestCommonPrefix(new String[] { "electric", "elephant", "elevator", "element" }));
    }
}