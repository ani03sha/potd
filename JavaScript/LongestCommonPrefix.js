/**
 * Given an array of strings, return the longest common prefix that is shared
 * amongst all strings. Note: you may assume all strings only contain lowercase
 * alphabetical characters.
 */
const longestCommonPrefix = (a) => {
    // Longest common prefix string
    let lcp = "";
    // Base condition
    if (a == null || a.length == 0) {
        return lcp;
    }
    // Find the minimum length string from the array
    let minimumLength = a[0].length;
    for (let i = 1; i < a.length; i++) {
        minimumLength = Math.min(minimumLength, a[i].length);
    }
    // Loop for the minimum length
    for (let i = 0; i < minimumLength; i++) {
        // Get the current character from first string
        let current = a[0][i];
        // Check if this character is found in all other strings or not
        for (let j = 0; j < a.length; j++) {
            if (a[j][i] != current) {
                return lcp;
            }
        }
        lcp += current;
    }
    return lcp;
};

console.log(longestCommonPrefix(["flower", "flow", "flight"]));
console.log(longestCommonPrefix(["dog", "racecar", "car"]));
console.log(longestCommonPrefix(["electric", "elephant", "elevator", "element"]))