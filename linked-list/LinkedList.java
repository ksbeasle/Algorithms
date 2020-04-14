import java.util.*;
public class LinkedList{

    Node head; 

    static class Node{
        int data;
        Node next;

        //constructor
        Node(int x){
            data = x;
        }
    }


    public static LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(list.head == null){
            list.head = newNode;
        }else{
            //get to the last node in the list
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currentNode = list.head;
        System.out.println("LINKED LIST DATA -- ");
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        //INSERT examples
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);

        printList(list);

    }



}