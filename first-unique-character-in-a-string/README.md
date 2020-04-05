# First Unique Character in a String
[LeetCode]https://leetcode.com/problems/first-unique-character-in-a-string/

---

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

#### Examples:

    s = "leetcode"
    return 0.

    s = "loveleetcode",
    return 2.

**_Note: You may assume the string contain only lowercase letters._**

---

## Thought process/Reason for approach

I used a hashmap to keep the count of how many characters are in the string. If the map already contains the character I increment the count by 1.
I use another loop starting with the first character and if that character only has 1 occurrence than I return the index of that character.

---
# Submission Details
![Details]()
---
# Refactoring?
None so far.
