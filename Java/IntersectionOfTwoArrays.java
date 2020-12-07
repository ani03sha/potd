import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given two arrays, write a function to compute their intersection.
 */
class IntersectionOfTwoArrays {
    private static int[] intersection(int[] nums1, int[] nums2) {
        // Set to store the elements of first array
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        // Set to store only the elements from second array which are in first array
        Set<Integer> set2 = new HashSet<>();
        // Loop through the elements of the second array
        for (int n : nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        return set2.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] num1 = new int[] { 1, 2, 2, 1 };
        int[] num2 = new int[] { 2, 2 };
        System.out.println(Arrays.toString(intersection(num1, num2)));

        num1 = new int[] { 4, 9, 5 };
        num2 = new int[] { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }
}