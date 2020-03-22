# Find First and Last Position of Element in Sorted Array
[LeetCode]https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

---
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

#### Example 1:

Input: nums = [5,7,7,8,8,10], target = 8

Output: [3,4]
#### Example 2:
Input: nums = [5,7,7,8,8,10], target = 6

Output: [-1,-1]

---

## Thought process/Reason for approach
First I created an array that would hold the result, it will be size 2 since we only need the first and last index of the target index. Then I created an arraylist that would hold all the values from the given array so that I could use the indexOf() and lastIndexOf() methods. Set the [0]/[1] index to indexOf and lastIndexOf to get the first index of the target and the last index of the target. If the target is not present it will return [-1,-1]. 

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/first-last-position-of-element/submission-details.png?raw=true)
---
# Refactoring?
None so far.