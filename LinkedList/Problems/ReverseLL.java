package Problems;

import Problems.LL.ListNode;



public class ReverseLL {
    

    // recursion reverse  
    // TC -> O(n)
    // SC -> O(n)
    // private void reverse(Node node) {
    //     if(node == tail) {
    //         head = tail;
    //         return;
    //     }

    //     reverse(node.next);

    //     tail.next = node ;
    //     tail = node;
    //     tail.next = null;
    // }

    // in-place reversal of LL -> 
    // public void reverse() {
    //     if(size < 2) {
    //         return ;
    //     }

    //     Node prev = null ;
    //     Node curr = head ;
    //     Node next = curr.next ;

    //     while(curr != null) {
    //         curr.next = prev;
    //         prev = curr ;
    //         curr = next ;
    //         if(next != null) {
    //             next = next.next ;
    //         }
    //     }
    //     head = prev ;
    // }

    // leetcode version -> 
    // TC -> O(n)
    // SC -> O(1)
    // public ListNode reverseList(ListNode head) {
    //     if(head == null) {
    //         return head ;
    //     }

    //     ListNode prev = null ;
    //     ListNode curr = head ;
    //     ListNode next = curr.next;

    //     while(curr != null) {
    //         curr.next = prev;
    //         prev = curr ;
    //         curr = next ;
    //         if(next != null) {
    //             next = next.next ;
    //         }
    //     }
    //     return head = prev ;
    // }

}
