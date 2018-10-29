package com.kiruthi.ds.linkedlist;

public class FindNthNodeFromEnd {

 /* Function to get the nth node from end of list */
    static void printNthFromLast(LinkedList llist, int n)
    {
        LinkedList.ListNode main_ptr = llist.head;
        LinkedList.ListNode  ref_ptr = llist.head;

        int count = 0;
        if (llist.head != null)
        {
            while (count < n)
            {
                if (ref_ptr == null)
                {
                    System.out.println(n+" is greater than the no "+
                            " of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
            while (ref_ptr != null)
            {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("Node no. "+n+" from last is "+
                    main_ptr.data);
        }
    }
    /*Drier program to test above methods */
    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        FindNthNodeFromEnd.printNthFromLast(llist, 4);
    }



}
