# Fibonacci Number
[LeetCode]https://leetcode.com/problems/single-number/

---
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

    n = 15

    Return:
    [
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
    ]


---

## Thought process/Reason for approach
Since the method calls for the return of a List<String> I create a new list<String>, once thats done I create a for loop starting at 1 and loop all the way until I reach the *n*, always checking if *n* is a multiple of 3 and 5 first then check for 3 and 5 separately. If no multiples I convert the int to string to match the generics of the list.

---
# Submission Details
![Details]()
---
# Refactoring?
None so far.