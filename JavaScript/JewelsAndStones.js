/**
 * Given a string representing your stones and another string representing a
 * list of jewels, return the number of stones that you have that are also
 * jewels.
 */
const numJewelsInStones = (J, S) => {
    if (J == null || J.length == 0 || S == null || S.length == 0) {
        return 0;
    }
    let count = 0;
    for (const c of S) {
        if (J.includes(c)) {
            count++;
        }
    }
    return count;
};

console.log(numJewelsInStones("aA", "aAAbbbb"));
console.log(numJewelsInStones("z", "ZZ"));