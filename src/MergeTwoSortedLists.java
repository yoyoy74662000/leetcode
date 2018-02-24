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
// space : O(n)
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null);
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
