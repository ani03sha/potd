import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two strings representing sentences, return the words that are not
 * common to both strings (i.e. the words that only appear in one of the
 * sentences). You may assume that each sentence is a sequence of words (without
 * punctuation) correctly separated using space characters.
 */
public class UncommonWordsFromTwoSentences {

    private static String[] uncommonFromSentences(String A, String B) {
        String AB = A + " " + B;
        Map<String, Integer> unique = new HashMap<>();
        for (String s : AB.split(" ")) {
            unique.put(s, unique.getOrDefault(s, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : unique.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return (String[]) result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(A, B)));

        A = "apple apple";
        B = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(A, B)));
    }
}