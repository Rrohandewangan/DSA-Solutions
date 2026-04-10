package Problems;

public class DuplicatesInSortedList {

    // TC -> O(n)
    // SC -> O(1)
    public ListNode deleteDuplicates(ListNode node) {
        if(node == null) {
            return node ;
        }
        ListNode head = node ;
        while(node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next ;
            } else {
                node = node.next ;
            }
        }  
        return head ;   
    }
    
    public static void main(String[] args) {
        
    }
    
}
