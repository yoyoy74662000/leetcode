/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 */

// time : O(n)
// space : O(1)

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++){
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}

public class RemoveNthNodeFromEndofList2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while(head != null){
            count++;
            head = head.next;

        }
        for(int i = 0; i < count - n; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}
