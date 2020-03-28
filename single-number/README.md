# Fibonacci Number
[LeetCode]https://leetcode.com/problems/single-number/

---
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

#### Example 1:

Input: [2,2,1]

Output: 1

#### Example 2:

Input: [4,1,2,1,2]

Output: 4

---

## Thought process/Reason for approach
So I decided to go with a hashmap to hold the *keys* which would be the values I loop through and the *values* which would be the number of occurrences the key has.

Once the map is complete I will loop through the map until I find the *key* with only 1 occurrence, which is the number I return.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/single-number/submission-details.png?raw=true)
---
# Refactoring?
None so far.