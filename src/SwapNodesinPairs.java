/**
 *  Given a linked list, swap every two adjacent nodes and return its head.
 *  For example,
 *  Given 1->2->3->4, you should return the list as 2->1->4->3.
 *  Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */


// time: O(n)
// space: O(1)


public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = head;
        while(l2 != null && l2.next != null){
            ListNode nextstart = l2.next.next;
            l1.next = l2.next;
            l2.next.next = l2;
            l2.next = nextstart;
            l1 = l2;
            l2 = l2.next;

        }
        return dummy.next;


    }
}
