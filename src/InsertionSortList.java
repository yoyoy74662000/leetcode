/**
 * Algorithm of Insertion Sort:
 * Insertion sort iterates, consuming one input element each repetition,
 * and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data,
 * finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 *
 */

//
//

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode prev = null, temp = null;
        while(cur != null && cur.next != null){
            // 看後者有沒有小於前者
            if(cur.val <= cur.next.val){
                cur = cur.next;
            }else{
                temp = cur.next;
                cur.next = temp.next;
                prev = dummy;
                // 如果 prev.next 小於 temp prev = prev.next
                while(prev.next.val <= temp.val){
                    prev = prev.next;
                }
                temp.next = prev.next;
                prev.next = temp;
            }
        }
        return dummy.next;
    }
}
