public class StackUsing2queue {
    
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
    public static void main(String[] args) {
        
    }
}
