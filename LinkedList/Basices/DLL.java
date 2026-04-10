public class DLL {
    
    private Node head;


    // insertion at first of DLL 
    
    public void insertFirst(int val) {
        Node node = new Node(val) ;
        node.next = head ;
        node.prev = null ;
        if(head != null) {
            head.prev = node ;
        }
        head = node ;
    }


    // display the DLL 
    public void display() {
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next ;
        }
        System.out.println("END");
    }


    // display the DLL in reverse
    public void displayRev() {
        Node temp = head ;
        Node last = null ;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp ;
            temp = temp.next ;
        }
        System.out.println("END");


        System.out.println("Print in Reverse");
        while(last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev ;
        }
        System.out.println("START");
    }


    // insertion at last DLL 
    public void insertLast(int val) {
        Node newNode = new Node(val) ;
        Node last = head ;

        newNode.next = null ;

        if(head == null) {
            newNode.prev = null ;
            head = newNode ;
            return ;
        }

        while(last.next != null) {
            last = last.next ;
        }

        last.next = newNode ;
        newNode.prev = last ;
    }

    // insertion at any index of DLL -> 
    public Node find(int value) {
        Node node = head ;
        while(node != null) {
            if(node.val == value) {
                return node ;
            }
            node = node.next ;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if(p == null) {
            System.out.println("does not exist");
            return ;
        }

        Node node = new Node(val);
        node.next = p.next ;
        p.next = node ;
        node.prev = p ;
        if(node.next != null) {
            node.next.prev = node ;
        }
    }
    
    private class Node {
        int val ;
        Node next ;
        Node prev ;

        public Node(int val) {
            this.val = val ;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val ;
            this.next = next ;
            this.prev = prev ;
        }
    }
}
