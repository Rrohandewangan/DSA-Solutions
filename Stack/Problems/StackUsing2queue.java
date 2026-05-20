public class StackUsing2queue {
    

    // TC -> push -> O(n)
          //   poll -> O(1)
          // peek -> O(1)


     public Queue<Integer> q1 ;
    public Queue<Integer> q2 ;

    public MyStack() {
         q1 = new ArrayDeque<>();
         q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q2.add(x);

        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue<Integer> temp = q1 ;
        q1 = q2 ;
        q2 = temp ;

    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }


    // Using 1 stack -> 
    // TC -> push -> O(n)
          //   poll -> O(1)
          // peek -> O(1)

          public Queue<Integer> q1 ;

    public MyStack() {
         q1 = new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        q1.add(x);

        for(int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll()) ;
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() ;
    }
    public static void main(String[] args) {
        
    }
}
