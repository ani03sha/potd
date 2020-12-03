/**
 * Given an array of integers, return the indices of numbers which sum to a given
 * target, k. Note: you may not sum a number with itself.
 */
const twoSum = (numbers, targetValue) => {
    // Array to store the result
    let result = [];
    // Map to store the difference and its index
    let index_map = new Map();
    // Loop for each element in the array
    for (let i = 0; i < numbers.length; i++) {
        let difference = targetValue - numbers[i];
        if (index_map.has(difference)) {
            result[0] = i;
            result[1] = index_map.get(difference);
            break;
        } else {
            index_map.set(numbers[i], i);
        }
    }
    return result;
};

let nums = [2, 7, 11, 15];
let target = 9;
console.log(twoSum(nums, target));

nums = [3, 2, 4];
target = 6;
console.log(twoSum(nums, target));