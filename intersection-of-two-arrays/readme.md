# Intersection of two arrays
 [LeetCode]https://leetcode.com/problems/intersection-of-two-arrays/

---
Given two arrays, write a function to compute their intersection.

#### Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]

Output: [2]

#### Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

*Note:
Each element in the result must be unique.
The result can be in any order.*

---

## Thought process/Reason for approach

So I went with a HashSet and ArrayList for a couple of reasons:

- contains() method
- No duplicates in a HashSet
- streams()/mapToInt() methods

So once I have both the hash set and arraylist I go ahead and add all the numbers from int[] nums1 into the hashset. This is where the no duplicates comes in handy, we don't want any duplicates because it is possible it will return the same number twice or more in the final result which is **NOT** what we want. Once all the values are inside the hashset we loop through int[] nums2 array and check if the value at index *i* is inside the hashset (contains()). If that value is indeed inside the hashset we will check if it is **NOT** inside the arraylist, if not we will add that number into the list.

Now that there is an arraylist with all the intersect values we need to return an int[] array which is what the challenge calls for. Since we used the generics Integer we can't directly map int to Integer so we use streams() and mapToInt(), which will convert each Integer value inside the arraylist into the int data type and successfully create an int[] res array.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/intersection-of-two-arrays/iofta.jpg?raw=true)
---
# Refactoring?
None so far.