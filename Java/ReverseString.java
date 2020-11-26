/**
 * Given a string, reverse all of its characters and return the resulting
 * string.
 */
public class ReverseString {

    private static String reverse(String s) {
        // Convert the string into character array
        char[] characters = s.toCharArray();
        // Left and right pointers
        int left = 0;
        int right = characters.length - 1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Swap the left and right characters
            char c = characters[left];
            characters[left] = characters[right];
            characters[right] = c;
            // Update the pointers
            left++;
            right--;
        }
        return new String(characters);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Cat"));
        System.out.println(reverse("Program of the day"));
        System.out.println(reverse("red quark"));
        System.out.println(reverse("level"));
        System.out.println(reverse(""));
    }
}