# Valid Anagram
[LeetCode]https://leetcode.com/problems/valid-anagram/

---
Given two strings s and t , write a function to determine if t is an anagram of s.

#### Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true
#### Example 2:

    Input: s = "rat", t = "car"
    Output: false

_**Note**_:
You may assume the string contains only lowercase alphabets.

_**Follow up**_:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

---

## Thought process/Reason for approach
So I first take both strings and turn them into char arrays and then used arrays.sort(). Then I create new strings out of both so that I can check if they are equal, if they are return true, else false. Also threw in a ternary if/else for fun.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/valid-anagram/submission-details.png?raw=true)
---
# Refactoring?
Possible to use streams to take away a few lines possibly a one/two liner.