package Problems;

import Problems.LL.ListNode;

public class RotateListFromRight {

    // TC -> o(n)
    // SC -> o(1)

    public ListNode rotateRight(ListNode head, int k) {
        if ( k < 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++ ;
        }


        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;

        for (int i = 0; i< skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;

    }
    
    public static void main(String[] args) {
        
    }
}
