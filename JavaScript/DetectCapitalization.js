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
const detect = (word) => {
    // Check if the first letter is capital
    if (isCapital(word[0])) {
        // Count of capital letters in the sentence
        let count = 1;
        // Count the total number of capital letters in the word/string
        for (let i = 1; i < word.length; i++) {
            if (isCapital(word[i])) {
                count++;
            }
        }
        // Valid capitalization will happen only in two scenarios
        // 1. If only the first letter is capital, or
        // 2. All the letters in the string are capital
        return count === 1 || count === word.length;
    }
    // If the first letter is not capital then there shouldn't be any capital
    // letter in the word
    else {
        for (let i = 1; i < word.length; i++) {
            if (isCapital(word[i])) {
                return false;
            }
        }
    }
    return true;
};

const isCapital = (c) => {
    return c >= 'A' && c <= 'Z';
};

console.log(detect("Anirudh"));
console.log(detect("USA"));
console.log(detect("redquark"));
console.log(detect("FlaG"));
console.log(detect("inCorrect"));