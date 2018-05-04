/**
 * Given a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * Can you solve it without using extra space?
 */

// time : O(n)
// space : O(1)

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if( head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode slow2  = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if( fast == slow){
                // when there is a circle
                while(slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow2;
            }
        }
        return null;
    }
}
