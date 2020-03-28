# Fibonacci Number
[LeetCode]https://leetcode.com/problems/move-zeroes/

---
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

#### Example:

    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]

_**Note:**_

You must do this in-place without making a copy of the array.
Minimize the total number of operations.


---

## Thought process/Reason for approach
Since I could not make a copy of the array I had to try a different approach so I decided to go with a list that would hold all non-zero values to stay true to the order of the numbers, while also keeping count of the number of zeros I came across. Then I loop through the list and replace the original values in the original array. I create another variable to start at the end of the array and use a while loop to continue looping until all zeros have been added to the end of the array.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/move-zeroes/submission-details.png?raw=true)
---
# Refactoring?
None so far.