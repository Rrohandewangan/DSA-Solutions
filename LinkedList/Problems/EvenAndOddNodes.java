public class EvenAndOddNodes {

     // TC -> O(n)
    // SC -> O(1)
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode oddIdx = head;
        ListNode evenIdx = head.next;
        ListNode evenHead = evenIdx;

        while(evenIdx != null && evenIdx.next != null) {
            oddIdx.next = evenIdx.next;
            oddIdx = oddIdx.next;

            evenIdx.next = oddIdx.next;
            evenIdx = evenIdx.next;
        }
            oddIdx.next = evenHead;
            return head;
}

    public static void main(String[] args) {
        
    }
}