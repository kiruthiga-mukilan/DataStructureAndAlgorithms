package com.kiruthi.ds.linkedlist;

public class DetectCycleInLinkedList {

    static int detectLoop(LinkedList llist) {
        LinkedList.ListNode slow_p = llist.head, fast_p = llist.head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        DetectCycleInLinkedList.detectLoop(llist);
    }
}
