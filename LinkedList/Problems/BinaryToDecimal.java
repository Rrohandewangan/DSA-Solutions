package Problems;

import Problems.LL.ListNode;

public class BinaryToDecimal {

    //  TC -> O(N)
    //  SC -> O(1)

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int num = 0;
        
        while(curr != null) {
            num = num * 2 + curr.val;
            curr = curr.next;
        }
        return num;
    }
    
    public static void main(String[] args) {
        
    }
}
