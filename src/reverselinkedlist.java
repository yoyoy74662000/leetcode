/**
 * Reverse a singly linked list.
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 *
 *
 1->2->3->4->5->NULL
    T
 1->null  2->3->4->5->NULL
          T
 1->null  2->3->4->5->NULL
 p        T
 1->null  2->3->4->5->NULL
 p        h
 1->null  2->3->4->5->NULL
 p        h  T
 2->1->null  3->4->5->NULL
 p           h
 */

// time : O(n)
// space : O(n)


//recursion
public class reverselinkedlist {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode root = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return root;
    }
}

//recursion
public class reverselinkedlist2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        //get second node
        ListNode second = head.next;
        //set first's next to be null
        head.next = null;

        ListNode rest = reverseList(second);
        second.next = head;

        return rest;
    }
}
//iteration
public class reverselinkedlist2 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        if (head == null || head.next == null) return head;
        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
