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
        ListNode prev = dummy;
        // ListNode first = prev.next;
        // ListNode second = prev.next.next;
        while(prev.next != null && prev.next.next != null){
            //每執行一個迴圈，重新定義prev, first, second
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            first.next = second.next;
            prev.next = second;
            second.next = first;
            prev = prev.next.next;
        }
        return dummy.next;
    }
}
