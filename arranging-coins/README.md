# Arranging Coins
[LeetCode]https://leetcode.com/problems/arranging-coins/

---
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

#### Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
#### Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.

---

## Thought process/Reason for approach
So pretty quickly I picked up on the fact that every row I would need a certain amount of coins no matter what.
So when I reached that row if I didn't have enough coins I would return the previous row number.

So I create a for loop starting i @ 1 to model row 1. So with each iteration we will subtract the row number (i) from the amount of coins we have left, because the row number we are at requires the same amount of coins. the num variable is there so I can take the value out of the for loop (scope issues). Once the for loop condition is broken, num will hold the latest row so we will return num.

---
# Submission Details
![Details]()
---
# Refactoring?
None so far.