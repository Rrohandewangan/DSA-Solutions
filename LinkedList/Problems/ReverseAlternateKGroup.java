package Problems;

import Problems.LL.ListNode;

public class ReverseAlternateKGroup {

    // TC -> o(n)
    // SC -> o(1)

    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }

         //skip the first left - 1 nodes
         ListNode curr = head;
         ListNode prev = null;

        while(curr != null) {
            // check if k nodes exist or not
            ListNode temp = curr ;
            int count = 0;
            while(temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            if(count < k) {
                break;
            }


            ListNode last = prev;
            ListNode newEnd = curr ;
   
            // reverse between left and right 
            ListNode next = curr.next ;
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr ;
                curr = next ;
                if(next != null) {
                    next = next.next ;
                }
            }
   
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
   
            newEnd.next = curr ;

            // skip the k nodes
            for (int i = 0; curr != null; i++) {
                prev = current;
                current = current.next;
            }
   
        }
        return head;
    }
    
    public static void main(String[] args) {
        
    }
}
