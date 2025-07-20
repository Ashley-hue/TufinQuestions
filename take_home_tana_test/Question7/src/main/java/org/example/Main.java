package org.example;

import java.util.LinkedList;

class Node{
    String data;//the type of data the nodes are holding (String)
    Node next;//to help traverse the linked list

    Node(String newNode){
        data = newNode;
        next = null;
    }
}
public class Main {

    static Node convertStrings(LinkedList<String> list){//convert the strings to nodes in order to traverse them as a linked list
        Node head = new Node(list.getFirst());//Have head point to the first item in the list
        Node current = head;

        for (int i = 1; i < list.size(); i++) {
            current.next = new Node(list.get(i));//converting the rest of the strings to nodes
            current = current.next;
        }
        return head;//return the new Linked list as nodes
    }
    static Node rotate(Node head){
        if(head == null || head.next == null){//base case
            return head;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next != null){//while there are still items in the list
            prev = curr;//prev node should come before current
            curr = curr.next;//current should point at the last node
        }
        Node lastNode = curr; //when while loop breaks curr will be lastNode
        Node secondLast = prev;//the secondLast element is pointed to by prev
        secondLast.next = null;//make the secondLast element the last one
        lastNode.next = head;//make the last node the first element

        return lastNode;
    }

    static Node rotateRight(Node head, int n){
        if(n==0){
            return head;//base case
        }
        for (int i = 0; i < n; i++) {
            head = rotate(head);//call the previous method to rotate the linked list to the right n number of times
        }
        printList(head);//In order to visualize the correct data
        return head;
    }

    static void printList(Node head){
        LinkedList<String> newList = new LinkedList<>();
        Node current = head;
        while(current != null){//while list is not empty
            newList.add(current.data + " ");//collect the data inside the nodes and add them to the list
            current = current.next;//iterate through the entire linkedlist
        }
        System.out.print("Rotated List: "+ newList);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();//Adding elements to nodes
        list.add("ID_A01");
        list.add("ID_A02");
        list.add("ID_A03");
        list.add("ID_A04");
        list.add("ID_A05");
        list.add("ID_A06");

        System.out.print("Before List: "+ list +"\n");//Visualizing old node
        int n = 2;
        Node head = convertStrings(list);//convert the strings to nodes first
        rotateRight(head, n);//then rotate them to the right
    }
}