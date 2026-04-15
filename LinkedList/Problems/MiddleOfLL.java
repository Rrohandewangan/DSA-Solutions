package Problems;

public class MiddleOfLL {
    
    // TC -> O(n)
    // SC -> o(1)
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s ;
    }

    public static void main(String[] args) {
        
    }
}
