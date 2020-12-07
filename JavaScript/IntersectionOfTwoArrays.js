/**
 * Given two arrays, write a function to compute their intersection.
 */
const intersectionOfTwoArrays = (nums1, nums2) => {
    // Set for storing elements of first array
    const set1 = new Set();
    // Add all the elements
    for (let i = 0; i < nums1.length; i++) {
        set1.add(nums1[i]);
    }
    // This set will store only common elements
    const set2 = new Set();
    // Loop through the elements of the second array
    for (let i = 0; i < nums2.length; i++) {
        if (set1.has(nums2[i])) {
            set2.add(nums2[i]);
        }
    }
    return Array.from(set2);
};

console.log(intersectionOfTwoArrays([1, 2, 2, 1], [2, 2]));
console.log(intersectionOfTwoArrays([4, 9, 5], [9, 4, 9, 8, 4]));