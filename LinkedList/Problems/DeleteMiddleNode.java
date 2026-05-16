package Problems;

import Problems.LL.ListNode;

public class DeleteMiddleNode {


    // TC -> O(n)
    // SC -> O(1)
    public ListNode deleteMiddle(ListNode head) {
         if(head == null || head.next == null) {
            return null;
         }

         ListNode s = head;
         ListNode f = head;
         ListNode prev = null;
         
        while(f != null && f.next != null) {
            prev = s;
            s = s.next;
            f = f.next.next;
        }
        prev.next = s.next;

        return head;
    }
    

    public static void main(String[] args) {
        
    }
}
