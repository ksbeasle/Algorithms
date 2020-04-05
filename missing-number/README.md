# Missing Number
[LeetCode]https://leetcode.com/problems/missing-number/

---
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

#### Example 1:

    Input: [3,0,1]
    Output: 2

#### Example 2:

    Input: [9,6,4,2,3,5,7,0,1]
    Output: 8

**_Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?_**

---

## Thought process/Reason for approach
I create a variable `actual` that will hold the actual value for that index, if the index does not match the actual then I return actual. I sort the array so that it will be easier to find the missing number. If I reach the end of the array I return the value at the end of the array +1.


---
# Submission Details
![Details]()
---
# Refactoring?
None so far.