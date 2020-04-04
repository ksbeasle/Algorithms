# Reverse Integer
[LeetCode]https://leetcode.com/problems/reverse-integer/

---
Given a 32-bit signed integer, reverse digits of an integer.

#### Example 1:

    Input: 123
    Output: 321

#### Example 2:

    Input: -123
    Output: -321

#### Example 3:

    Input: 120
    Output: 21

**_Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows._**


---

## Thought process/Reason for approach
So this version of reverse integer was a little different. The first thing I did was check if the number is negative. If it is I would change the `boolean` value to true and then make the number positive. For the actual reversal I created a string to hold the reversed version of the number. Turn that number into a string, and then turn that string into a char array. I would then loop through that char array from the last index to get the reverse of it. Once I've got the reverse version of the number in string format I use a `try-catch` to make sure if we get a Number format exception we will just return 0. If everything checks out I check if isNegative is true, if it is return the integer value of the reverse string multiplied by -1, if not just return the integer value of the string as is.

---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/reverse-integer/submission-details.png?raw=true)
---
# Refactoring?
None so far.
