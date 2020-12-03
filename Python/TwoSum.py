"""
Given an array of integers, return the indices of numbers which sum to a given
target, k. Note: you may not sum a number with itself.
"""
from typing import List


class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # List to store results
        result = []
        # Dictionary to store the difference and its index
        index_map = {}
        # Loop for each element
        for i, n in enumerate(nums):
            # Difference which needs to be checked
            difference = target - n
            if difference in index_map:
                result.append(i)
                result.append(index_map[difference])
                break
            else:
                index_map[n] = i
        return result


if __name__ == "__main__":
    t = TwoSum()
    numbers = [2, 7, 11, 15]
    target_value = 9
    print(str(t.twoSum(numbers, target_value)))

    numbers = [3, 2, 4]
    target_value = 6
    print(str(t.twoSum(numbers, target_value)))
