package com.kiruthi.ds.linkedlist;

public class ReverseLinkedList {
    /* Function to reverse the linked list */
    static LinkedList.ListNode reverse(LinkedList.ListNode node) {
        LinkedList.ListNode prev = null;
        LinkedList.ListNode current = node;
        LinkedList.ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    static void printList(LinkedList.ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        ReverseLinkedList.printList(ReverseLinkedList.reverse(llist.head));

    }
}
