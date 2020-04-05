import java.util.*;
class Solution {
//LIST NODE DETAILS
public static class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
         val = x;
    }
}

public static ListNode reverseList(ListNode head){
    ListNode temp = head;
    Stack<Integer> s = new Stack<Integer>();
    while(temp != null){
        s.push(temp.val);
        temp = temp.next;
    }
    temp = head;
    while(temp != null && !s.empty()){
        temp.val = s.pop();
        if(s.empty()){
            break;
        }
        temp = temp.next;
    }
    return head;
}


public static void main(String[] args){
    //Test case 1
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    
    ListNode res = reverseList(a);
    //we expect 5-4-3-2-1
    while(res != null){
        System.out.println(res.val);
        res = res.next;
    }   
}
}