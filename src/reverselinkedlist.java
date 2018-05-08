/**
 * Reverse a singly linked list.
 *
 *
 *
 *
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
