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

    //Add Node to linked list
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

    //Delete a Node
    public static LinkedList deleteNode(LinkedList list, int key){
        Node prev = null;
        Node currentNode = list.head;
        if(list.head == null){
            System.out.println("--- LINKED LIST IS EMPTY ---");
            return list;
        }
        if(currentNode != null && currentNode.data == key){
            list.head = currentNode.next;
            System.out.println("--- NODE DELETED FOR KEY --- " + key);
            return list;
        }
        while(currentNode != null && currentNode.data != key){
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode == null){
            System.out.println("--- NODE COULD NOT BE FOUND ---");
            return list;
        }else{
            prev.next = currentNode.next;
            return list;
        }
        
    }

    //Traverse linked list
    public static void printList(LinkedList list){
        Node currentNode = list.head;
        System.out.println("LINKED LIST DATA -- ");
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        LinkedList emptyList = new LinkedList();

        //INSERT examples
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);

        //Before deletion
        printList(list);

        //After deletion
        //delete 5
        deleteNode(list, 5);
        printList(list);

    }



}