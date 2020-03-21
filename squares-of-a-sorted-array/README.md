# Squares of a Sorted Array
[LeetCode]https://leetcode.com/problems/squares-of-a-sorted-array/

---
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

 

#### Example 1:

Input: [-4,-1,0,3,10]

Output: [0,1,9,16,100]

#### Example 2:

Input: [-7,-3,2,3,11]

Output: [4,9,9,49,121]
 

*Note:*
*1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.*

---

## Thought process/Reason for approach
I first create an int[] array with the same length as the array thats passed in since we aren't filtering anything out. I loop through the *A* array and while squaring each value add it to the same index of the res array.

Once the res array is complete I use sort() from Arrays import to sort the array in ascending order, then return res.


---
# Submission Details
![Details]()
---
# Refactoring?
Could do a manual sort like bubble sort for practice but this is fine.