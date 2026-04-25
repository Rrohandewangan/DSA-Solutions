package Problems;

import Problems.LL.ListNode;

public class ReorderLL {
    
    // TC -> O(n)
    // SC -> o(1)
    
    // public void reorderList(ListNode head) {
    //     if(head == null || head.next == null) {
    //         return;
    //     }

    //     ListNode mid = middleNode(head);

    //     ListNode headSecond = reverseList(mid);
    //     ListNode headFirst = head;

    //     // rearrange List
    //     while(headFirst != null && headSecond != null) {
    //         ListNode temp = headFirst.next;
    //         headFirst.next = headSecond;
    //         headFirst = temp;

    //         ListNode temp2 = headSecond.next;
    //         headSecond.next = headFirst;
    //         headSecond = temp2 ;
    //     }

    //     // next of tail to null
    //     if(headFirst != null) {
    //         headFirst.next = null;
    //     }
    // }
}
