/**
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Constraints: 1 <= a.length, b.length <= 10^4 a and b consist only of '0' or
 * '1' characters. Each string does not contain leading zeros except for the
 * zero itself.
 */
public class AddBinary {

    private static String addBinary(String a, String b) {
        // Resultant String
        StringBuilder result = new StringBuilder();
        // Indices for a and b
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Carry
        int carry = 0;
        while (i >= 0 || j >= 0) {
            // Sum of two bits
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            // Add the bit to the result
            result.insert(0, sum % 2);
            // Modify carry
            carry = sum / 2;
        }
        // Final check if carry exists
        if (carry > 0) {
            result.insert(0, 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }
}