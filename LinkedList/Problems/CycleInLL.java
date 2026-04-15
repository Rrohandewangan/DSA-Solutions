package Problems;

https://leetcode.com/problems/linked-list-cycle/
public class CycleInLL {
    
    // TC -> O(n)
    // SC -> O(1)
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next ;
            slow = slow.next ;
            if(fast == slow) {
                return true ;
            }
        }
        return false ;
    }


    // find length of cycle
     public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next ;
            slow = slow.next ;
            if(fast == slow) {
                // calculate the length
                ListNode temp = slow ;
                int length = 0 ;
                do {
                    temp = temp.next ;
                    length++ ;
                } while(temp != slow) ;
                return length ;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        
    }
}
