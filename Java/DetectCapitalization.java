/**
 * Given a word, you need to judge whether the usage of capitals in it is right
 * or not.
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA". All letters in this word
 * are not capitals, like "leetcode". Only the first letter in this word is
 * capital, like "Google". Otherwise, we define that this word doesn't use
 * capitals in a right way.
 */
public class DetectCapitalization {

    private static boolean detect(String word) {
        // Check if the first letter is capital
        if (isCapital(word.charAt(0))) {
            // Count of capital letters in the sentence
            int count = 1;
            // Count the total number of capital letters in the word/string
            for (int i = 1; i < word.length(); i++) {
                if (isCapital(word.charAt(i))) {
                    count++;
                }
            }
            // Valid capitalization will happen only in two scenarios
            // 1. If only the first letter is capital, or
            // 2. All the letters in the string are capital
            return count == 1 || count == word.length();
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (isCapital(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isCapital(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static void main(String[] args) {
        System.out.println(detect("Anirudh"));
        System.out.println(detect("USA"));
        System.out.println(detect("redquark"));
        System.out.println(detect("FlaG"));
        System.out.println(detect("inCorrect"));
    }
}