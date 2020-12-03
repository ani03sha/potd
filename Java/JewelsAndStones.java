/**
 * Given a string representing your stones and another string representing a
 * list of jewels, return the number of stones that you have that are also
 * jewels.
 */
public class JewelsAndStones {

    private static int numJewelsInStones(String J, String S) {
        if (J == null || J.isEmpty() || S == null || S.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            if (J.indexOf(c) > -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
