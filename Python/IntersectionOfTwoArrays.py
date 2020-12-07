"""
Given two arrays, write a function to compute their intersection.
"""
from typing import List


class IntersectionOfTwoArrays:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # Set for storing elements of first array
        set1 = set(nums1)
        # This set will store only common elements
        set2 = set(nums2)
        # Loop through the elements of the second array
        return list(set1 & set2)


if __name__ == "__main__":
    i = IntersectionOfTwoArrays()
    print(i.intersection([1, 2, 2, 1], [2, 2]))
    print(i.intersection([4, 9, 5], [9, 4, 9, 8, 4]))
