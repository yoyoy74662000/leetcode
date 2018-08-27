/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You may not modify the values in the list's nodes, only nodes itself may be changed.

 Example 1:

 Given 1->2->3->4, reorder it to 1->4->2->3.

 Example 2:

 Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 *
 */

// time: O(n)
// space: O(1)

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode l1 = head;
        ListNode temp = null;
        while(fast != null && fast.next != null){
            temp = slow; 2
            slow = slow.next; 3
            fast = fast.next.next; 5
        }
        temp.next = null;
        ListNode l2 = reverse(slow);
        merge(l1,l2);
    }
    // 3 4 5 null
    // h t
    // 3 -> null 4 -> 5 -> null
    // h         t
    // p         h
    // p         h    t
    // 4 -> 3 -> null 5 -> null
    // h    p         t
    // p              h
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static ListNode merge(ListNode p, ListNode q){
        while(p != null || q != null){
            ListNode n1 = p.next;
            ListNode n2 = q.next;
            p.next = q;
            if(n1 == null) break;
            q.next = n1;
            p = n1;
            q = n2;
        }
        return p;
    }
}
