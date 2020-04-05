# Reverse Linked List
[LeetCode]https://leetcode.com/problems/reverse-linked-list/

---
Reverse a singly linked list.

#### Example:

    Input: 1->2->3->4->5->NULL
    Output: 5->4->3->2->1->NULL

**_Follow up:
A linked list can be reversed either iteratively or recursively. Could you implement both?_**

---

## Thought process/Reason for approach
So my approach to this was to create a stack that would hold the values in reverse order from the original linked list. So as I iterate through the linked list I push each value on the stack. After that I set temp to head again since I am going to overwrite each node with the stack values. This will help prevent making a new set of nodes. So I use a `while` loop while that stack is *NOT* empty and the node is not null. At each node I pop the top value and set it equal to that nodes value. I break if the stack is empty. Then return head since I changed the original linked list.


---
# Submission Details
![Details](https://github.com/ksbeasle/Algorithms/blob/master/reverse-linked-list/submission-details.png?raw=true)
---
# Refactoring?
None so far.