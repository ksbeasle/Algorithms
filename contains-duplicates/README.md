# Contains Duplicate
[LeetCode]https://leetcode.com/problems/contains-duplicate/

---

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

#### Example 1:

    Input: [1,2,3,1]
    Output: true

#### Example 2:

    Input: [1,2,3,4]
    Output: false

#### Example 3:

    Input: [1,1,1,3,3,4,3,2,4,2]
    Output: true


---

## Thought process/Reason for approach
First I had to check if the array was empty or had at least one element, if that was the case I would return `false`. If not I would sort the array and loop through the entire array and if I found any elements that appeared twice I would return `true` else I would return `false`.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/contains-duplicates/submission-details.png?raw=true)
---
# Refactoring?
None so far.
