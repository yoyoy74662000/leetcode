/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */

// time : O(nlogn)
// space : O(1)

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getmid(head);
        ListNode next = mid.next;
        mid.next = null;
        return merge(sortList(head), sortList(next));
    }

    public static ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(a != null && b != null){
            if(a.val <= b.val){
                cur.next = a;
                a= a.next;
            }else{
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        if(a == null) cur.next = b;
        else cur.next = a;
        return dummy.next;
    }
}
