public class RandomPointerInLL {

    // TC -> O(n)
    // SC -> O(n)
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();
       
       Node newHead = new Node(head.val);
       Node oldTemp = head.next;
       Node newTemp = newHead;

       map.put(head, newHead);

       while(oldTemp != null) {
        Node copyNode = new Node(oldTemp.val);
        map.put(oldTemp, copyNode);

        newTemp.next = copyNode;

        oldTemp = oldTemp.next;
        newTemp = newTemp.next;
       }

       // assign random pointers 
       oldTemp = head;
       newTemp = newHead;
       while(oldTemp != null) {
            newTemp.random = map.get(oldTemp.random);
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
       }

       return newHead;
    }

    public static void main(String[] args) {
        
    }
}