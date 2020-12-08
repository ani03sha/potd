/**
 * Given two strings representing sentences, return the words that are not
 * common to both strings (i.e. the words that only appear in one of the
 * sentences). You may assume that each sentence is a sequence of words (without
 * punctuation) correctly separated using space characters.
 */
const uncommonFromSentences = (A, B) => {
    const AB = (A + " " + B).split(" ");
    const unique = new Map();
    for (let i = 0; i < AB.length; i++) {
        if (unique.has(AB[i])) {
            unique.set(AB[i], unique.get(AB[i]) + 1);
        } else {
            unique.set(AB[i], 1);
        }
    }
    const result = [];
    for (let [k, v] of unique) {
        if (v === 1) {
            result.push(k);
        }
    }
    return result;
};

console.log(uncommonFromSentences("this apple is sweet", "this apple is sour"));
console.log(uncommonFromSentences("apple apple", "banana"));