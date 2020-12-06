/**
 * Given a string, return the index of its first unique character. If a unique
 * character does not exist, return -1.
 */
const firstUniqueCharacter = (s) => {
    // Base conditions
    if (s === undefined || s.length === 0) {
        return -1;
    }
    // This array will store the count of every character in the string
    // Assuming the string contains only lowercase english characters,
    // there will only be 26 different characters to consider.
    const frequencies = new Array(26).fill(0);
    // Loop through the string character by character
    s.split('').forEach(c => {
        if (!frequencies[c]) {
            frequencies[c] = 1;
        } else {
            frequencies[c]++;
        }
    });
    // Now again loop through the string and return as soon as the character
    // with frequency equals to 1 is found
    for (let i = 0; i < s.length; i++) {
        if (frequencies[s[i]] === 1) {
            return i;
        }
    }
    return -1;
};

console.log(firstUniqueCharacter("developer"));
console.log(firstUniqueCharacter("abcabd"));
console.log(firstUniqueCharacter("aabbccdd"));