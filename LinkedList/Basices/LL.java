public class LL {
    
    private Node head ;
    private Node tail ;
    private int size ;
    public LL() {
        this.size = 0 ;
    }
    
    // insert at beginning of LL
    public void insertFirst(int val) {
        Node newNode = new Node(val) ;
        newNode.next = head ;
        head = newNode ;

        if(tail == null) {
            tail = head ;
        }

        size += 1 ;
    }

    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head) ;
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);  
            size++ ;
            return temp ;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    // display value of LL 
    public void display() {
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next ;
        }
        System.out.println("END");
    }


    // insertion at last of LL 
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val) ;
            return ;
        }
        Node newNode = new Node(val) ;
        tail.next = newNode ;
        tail = newNode ;
        size++ ;
    }


    // insertion at particular index
    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return ;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head ;
        for(int i = 1;  i < index; i++) {
            temp = temp.next; 
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode ;

        size++ ;

    }


    // deletion at beginning of LL
    public int deleteFirst() {
        int val = head.value ;
        head = head.next ;
        if(head == null) {
            tail = null ;
        }
        size-- ;
        return val ;
    }

    // deletion from last of LL
    public Node get(int index) {
        Node node = head ;
        for (int i = 0; i < index; i++) {
            node = node.next ;
        }
        return node;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst() ;
        }

        Node secondLast = get(size - 2) ;
        int val = tail.value ;
        tail = secondLast ;
        tail.next = null ;
        return val ;

    }


    // deletion from particular index 
    public int delete(int index) {
        if(index == 0) {
            return deleteFirst() ;
        }

        if(index == size - 1) {
            return deleteLast() ;
        }

        Node prev = get(index - 1) ;
        int val = prev.next.value ;

        prev.next = prev.next.next ;

        return val ;
    }


    // find value any Node
     public Node find(int value) {
        Node node = head ;
        while(node != null) {
            if(node.value == value) {
                return node ;
            }
            node = node.next ;
        }
        return null;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value ;
        }

        public Node(int value, Node next) {
            this.value = value ;
            this.next = next ;
        }
    }
}
