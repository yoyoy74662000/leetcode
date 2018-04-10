/**
 * Given a sorted linked list,
 * delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 */


// time : O(n)
// space : O(1)


public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while(p.next != null && p.next.next != null){
            if(p.next.val == p.next.next.val){
                int sameval = p.next.val;
                while(p.next != null && p.next.val == sameval){
                    p.next = p.next.next;
                }
            }else{
                p = p.next;
            }
        }
        return dummy.next;
    }
}
