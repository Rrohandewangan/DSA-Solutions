public class QueueFrom2Stack {
    
    // public QueueFromStack() {
    //      public Stack<Integer> first;
    //      public Stack<Integer> second;

    //      public QueueFromStack() {
    //         first = new Stack<>();
    //         second = new Stack<>();
    //      }
    // }
    
    // public void push(int x) {
    //     first.push(x); 
    // }
    
    // public int pop() throws Exception{
    //     while(!first.isEmpty()) {
    //         second.push(first.pop());
    //     }
    //     int removed = second.pop();

    //     while(!second.isEmpty()) {
    //         first.push(second.pop());
    //     }

    //     return removed;
    // }
    
    // public int peek() throws Exception{
    //     while(!first.isEmpty()) {
    //         second.push(first.pop());
    //     }
    //     int peeked = second.peek();

    //     while(!second.isEmpty()) {
    //         first.push(second.pop());
    //     }

    //     return peeked
    //     ;
    // }
    
    // public boolean empty() {
    //     return first.isEmpty();
    // }


    // // Remove Efficient Method ->
    // public QueueFromStack() {
    //      public Stack<Integer> first;
    //      public Stack<Integer> second;

    //      public QueueFromStack() {
    //         first = new Stack<>();
    //         second = new Stack<>();
    //      }
    // }
    
    // public void push(int x) {
    //     while(!first.isEmpty()) {
    //         second.push(first.pop());
    //     }

    //     first.push(x);

    //     while(!second.isEmpty()) {
    //         first.push(second.pop());
    //     }
    // }
    
    // public int pop() throws Exception{
    //     return first.pop();
    // }
    
    // public int peek() throws Exception{
    //     return first.peek();
    // }
    
    // public boolean empty() {
    //     return first.isEmpty();
    // }


    // leetcode version -> 

    // ALL function is work in O(1) TC ->

    
//     class MyQueue {

//     public Stack<Integer> first;
//     public Stack<Integer> second;

//     public MyQueue() {
//          first = new Stack<>();
//          second = new Stack<>();
//     }
    
//     public void push(int x) {
//         first.push(x); 
//     }
    
//     public int pop() {
//         if(second.isEmpty()) {
//             while(!first.isEmpty()) {
//                 second.push(first.pop());
//             }
//         }
//         return second.pop();
//     }
    
//     public int peek() {
//         if(second.isEmpty()) {
//             while(!first.isEmpty()) {
//                 second.push(first.pop());
//             }
//         }
//         return second.peek();
//     }
    
//     public boolean empty() {
//         return first.isEmpty() && second.isEmpty();
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */
}

