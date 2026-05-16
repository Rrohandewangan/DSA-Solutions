import Problems.LL.ListNode;

public class DeleteNthNodeFromLast {




    // uses 2 passes -> 
    // TC -> O(n)
    // SC -> O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return head.next;
        }

        ListNode node = head;
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
         
        if(length == n) {
            return head.next;
        }
        int k = length - n ;
        ListNode curr = head;
        
        for(int i=1; i<k; i++) {
           curr = curr.next;
        }
        if(curr != null && curr.next != null) {
             curr.next = curr.next.next;
        }

        return head;
    }


    // single pass -> 
    // TC -> O(n)
    // SC -> O(1)

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return head.next;
        }

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0; i<n; i++) {
            fast = fast.next;
        }

        if(fast == null) {
            return head.next;
        }

        while(fast.next != null) {
            fast = fast.next ;
            slow = slow.next ;
        }

        slow.next = slow.next.next;

        return head;
    }   
    public static void main(String[] args) {
        
    }
}