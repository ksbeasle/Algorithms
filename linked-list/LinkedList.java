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
    //Size of linked list
    public static int Size(LinkedList list){
        Node curr = list.head;
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }

    //is empty
    public static boolean isEmpty(LinkedList list){
        if(list.head == null){
            return true;
        }
        return false;
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
        //Once we find the Node that contains the key we will jump out of this
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

    //Delete node at given position
    public static LinkedList deleteNodeAtPosition(LinkedList list, int pos){
            Node curr = list.head;
            Node prev = null;
            int index = 1;
            if(pos == 0){
                list.head = curr.next;
                System.out.println("Node removed");
                return list;
            }
            if(pos > Size(list)){
                System.out.println("Position does not exist in list");
                return list;
            }
            //We will keep iterating until we match index with pos
            while(pos != index){
                prev = curr;
                curr = curr.next;
                index++;
            }

            if(curr == null){
                System.out.println("Position does not exist in list");
            }
            prev.next = curr.next;



        return list;
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

        //is empty
        System.out.println(isEmpty(list));

        //INSERT examples
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        
      
        System.out.println("Size of list: "+Size(list));
        //Before deletion
        printList(list);

        //After deletion
        //delete 5
        deleteNode(list, 5);
        printList(list);

        //After pos deletion
        deleteNodeAtPosition(list, 2);
        printList(list);

    }



}