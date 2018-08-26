/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

 Example:

 Input:
 [
 1->4->5,
 1->3->4,
 2->6
 ]
 Output: 1->1->2->3->4->4->5->6
 *
 *
 */
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return null;
        int len = lists.length;
        if(len == 0) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = lists[0];
        ListNode current = dummy;

        for(int i = 1; i < len; i++){
            current.next = merge(lists, dummy.next, lists[i]);
        }
        return dummy.next;
    }

    public ListNode mergeTwoLists(ListNode[] lists, ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode p = l1;
        ListNode q = l2;
        while(p != null && q != null){
            if(p.val < q.val){
                cur.next = new ListNode(p.val);
                p = p.next;
            }
            else{
                cur.next = new ListNode(q.val);
                q = q.next;
            }
            cur = cur.next;
        }
        if(p != null){
            cur.next = p;
        }else{
            cur.next = q;
        }
        return dummy.next;
    }
}
