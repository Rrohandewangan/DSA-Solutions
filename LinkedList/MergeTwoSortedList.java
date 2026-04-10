public class MergeTwoSortedList {


    // TC -> O(n + m)
    // SC _> O(1)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode() ;
        ListNode tail = dummyHead ;
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1 ;
                list1 = list1.next ;
                tail  = tail.next ;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2 ;
        return dummyHead.next ;

    }


    // recursive approach ->
    // TC -> O(n + m)
    // SC -> O(1)
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }

        //case1 ->
        if(head1.val <= head2.val) {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        } else {
             head2.next = mergeTwoLists(head1, head2.next);
            return head2;
        }
    }

    public static void main(String[] args) {
        
    }
}