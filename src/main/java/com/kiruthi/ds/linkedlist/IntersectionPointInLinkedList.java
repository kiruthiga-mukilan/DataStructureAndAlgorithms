package com.kiruthi.ds.linkedlist;

public class IntersectionPointInLinkedList {

    /*function to get the intersection point of two linked
   lists head1 and head2 */
    static int getNode(LinkedList l1,LinkedList l2) {
        int c1 = getCount(l1.head);
        int c2 = getCount(l2.head);
        int d;

        if (c1 > c2) {
            d = c1 - c2;
            return _getIntesectionNode(d, l1.head, l2.head);
        } else {
            d = c2 - c1;
            return _getIntesectionNode(d, l2.head, l1.head);
        }
    }

    /* function to get the intersection point of two linked
     lists head1 and head2 where head1 has d more nodes than
     head2 */
    static int _getIntesectionNode(int d, LinkedList.ListNode node1, LinkedList.ListNode node2) {
        int i;
        LinkedList.ListNode current1 = node1;
        LinkedList.ListNode current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }

    /*Takes head pointer of the linked list and
    returns the count of nodes in the list */
    static int getCount(LinkedList.ListNode node) {
        LinkedList.ListNode current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(15);
        llist.push(35);
        llist.push(4);
        llist.push(20);

        LinkedList l1list = new LinkedList();
        l1list.push(15);
        l1list.push(35);
        l1list.push(4);
        l1list.push(10);


        System.out.println("The node of intersection is " + IntersectionPointInLinkedList.getNode(llist,l1list));

    }

}
