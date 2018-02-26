/**
 * Reverse a singly linked list.
 *
 *
 *
 *
 */

// time : O(n)
// space : O(n)

public class reverselinkedlist {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode root = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return root;
    }
}
