/**
 * Given two strings s and t return whether or not s is an anagram of t. Note:
 * An anagram is a word formed by reordering the letters of another word.
 */
const isAnagram = (s, t) => {
    // Base condition
    if (s.length !== t.length) {
        return false;
    }
    // Counter to store the count of characters
    let counter = {};
    // Loop for each character in the strings
    for (let i = 0; i < s.length; i++) {
        counter[s[i]] = counter[s[i]] ? counter[s[i]]++ : 1;
        if (!counter[t[i]]) {
            counter[t[i]] = 0;
        }
        counter[t[i]]--;

    }
    // Check if there is character whose count is non-zero
    for (let key in counter) {
        if (counter[key] !== 0) {
            return false;
        }
    }
    return true;
};

console.log(isAnagram("aa", "bb"));
console.log(isAnagram("anagram", "nagaram"));
console.log(isAnagram("rat", "car"));