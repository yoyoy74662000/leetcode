/**
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example, Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 *
 *
 *
 */

// time : O(n)
// space : O(1)

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        while(cur.next != null){
            if(cur.next.val == cur.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
