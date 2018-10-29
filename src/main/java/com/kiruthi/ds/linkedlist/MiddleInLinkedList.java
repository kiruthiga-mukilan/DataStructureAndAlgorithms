package com.kiruthi.ds.linkedlist;

public class MiddleInLinkedList {
    /* Function to print middle of linked list */
    static void printMiddle(LinkedList.ListNode head) {
        LinkedList.ListNode slow_ptr = head;
        LinkedList.ListNode fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }
    }


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(15);
        llist.push(35);
        llist.push(4);
        llist.push(20);
        MiddleInLinkedList.printMiddle(llist.head);

    }
}
