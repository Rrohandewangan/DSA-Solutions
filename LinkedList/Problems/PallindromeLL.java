import Problems.LL.ListNode;

public class PallindromeLL {

    // public ListNode findMiddle(ListNode head) {
    //     ListNode hare = head ;
    //     ListNode turtle = head ;

    //     while(hare.next != null && hare.next.next != null) {
    //         hare = hare.next.next ;
    //         turtle = turtle.next ;
    //     }
    //     return turtle ;
    // }

    // public ListNode reverse(ListNode head) {

    //     ListNode prev = null ;
    //     ListNode curr = head ;
    //     while(curr != null) {
    //         ListNode next = curr.next ;
    //         curr.next = prev ;
    //         prev = curr ;
    //         curr = next ;
    //     }
    //     return prev ;
    // }

    // public boolean isPalindrome(ListNode head) {
    //  if(head == null & head.next == null) {
    //     return true ;
    //  }

    //  ListNode middle = findMiddle(head) ;
    //  ListNode secondHalfStart = reverse(middle.next) ;

    //  ListNode firsthalfStart = head ;
    //  while(secondHalfStart != null) {
    //     if(firsthalfStart.val != secondHalfStart.val) {
    //         return false ;
    //     }
    //     firsthalfStart = firsthalfStart.next ;
    //     secondHalfStart = secondHalfStart.next ;
    //  }
    //  return true ;
    // }


    // new method

    // TC -> O(n)
    // SC -> O(1)

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

        // compare both the halves
        while(head != null && headSecond != null) {
            if(head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(reverseHead);

        return head == null || headSecond == null;
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s ;
    }

     public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head ;
        }

        ListNode prev = null ;
        ListNode curr = head ;
        ListNode next = curr.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr ;
            curr = next ;
            if(next != null) {
                next = next.next ;
            }
        }
        return head = prev ;
    }
    public static void main(String[] args) {
        
    }
}