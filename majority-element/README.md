# Majority Element
[LeetCode]https://leetcode.com/problems/majority-element/

---
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

#### Example 1:

    Input: [3,2,3]
    Output: 3
#### Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2

---

## Thought process/Reason for approach
So for this one I took a similar approach to the single-number problem and went with a hashmap to contain all the *keys* (the numbers) and the *values* (number of occurrences). If the key was not in the map I would add it to the map, if that key was already present I would increment its value by 1;

It gets pretty tricky and my approach here is kind of janky, I first chose a max which is just the first index of nums[]. Then I used two for loops. The first for loop is going to grab the max value but the challenge wants us to return the key. I had some trouble doing that since I could not just return the key. So the second for loop is used to find the key based on the max that we got from the previous for loop.

Some possible issues is if there might be two keys with the same max, I think it will return the first key that matches max.

---
# Submission Details
![Details]()
---
# Refactoring?
This can be done I think using comparator, but it seemed outside the scope of this problem. And my approach could also be very wrong.