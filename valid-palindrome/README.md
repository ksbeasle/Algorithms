# Valid Palindrome
[LeetCode]https://leetcode.com/problems/valid-palindrome/

---
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

#### Example 1:

    Input: "A man, a plan, a canal: Panama"
    Output: true

#### Example 2:

    Input: "race a car"
    Output: false

---

## Thought process/Reason for approach
To find a valid palindrome I first use regex to remove anything that isn't a number or a letter and replace it with an empty string. Then I create a new string that will hold the reverse of that string. Loop through the original string and append it onto the rev string. Then I change both `toLowerCase()`. Check if they are equal, if they are return true, if not false.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/valid-palindrome/submission-details.png?raw=true)
---
# Refactoring?
None so far.
