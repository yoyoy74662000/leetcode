/**
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 */
// time : O(n)
// space : O(n), O(1)

// 遞歸
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;;
        if(l1 == null) return l2;
        if(l2 == null)  return l1;

        ListNode node;
        if(l1.val < l2.val){
            node = l1;
            node.next = mergeTwoLists(l1.next, l2);
        }
        else{
            node = l2;
            node.next = mergeTwoLists(l1, l2.next);
        }
        return node;
    }
}

// dummy 方法
public class MergeTwoSortedLists2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        cur.next = merge(l1, l2);
        return dummy.next;
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode p = l1, q = l2;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(p != null && q != null){
            if(p.val <= q.val){
                cur.next = new ListNode(p.val);
                p = p.next;
                cur = cur.next;
            }else{
                cur.next = new ListNode(q.val);
                q = q.next;
                cur = cur.next;
            }
        }
        if(p == null){
            cur.next = q;
        }else{
            cur.next = p;
        }
        return dummy.next;
    }
}
