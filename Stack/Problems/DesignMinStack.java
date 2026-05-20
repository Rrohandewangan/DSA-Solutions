public class DesignMinStack {

    // method -> 1
    // All operations Take O(1) TC and O(2 * n) SC

//     class MinStack {

//     Stack<int[]> s;

//     public MinStack() {
//         s = new Stack<>();
//     }
    
//     public void push(int val) {
//         if(s.isEmpty()) {
//             s.push(new int[]{val, val});
//         } else {
//             int minVal = Math.min(val, s.peek()[1]);

//             s.push(new int[]{val, minVal});
//         }
//     }
    
//     public void pop() {
//         s.pop();
//     }
    
//     public int top() {
//         return s.peek()[0];
//     }
    
//     public int getMin() {
//         return s.peek()[1];
//     }
// }


 
    // Method -> 2 -> 

    // ALL Operations Complexity -> O(1)
 // SC -> O(n)

//     Stack<Long> s;
//     long minVal;

//     public MinStack() {
//         s = new Stack<>();
//     }
    
//     public void push(int val) {

//         if(s.isEmpty()) {
//             s.push((long) val);
//             minVal = val;
//         } else {
//             if(val < minVal) {
//                 s.push(2L * val - minVal);
//                 minVal = val;
//             } else {
//                 s.push((long) val);
//             }
//         }
//     }
    
//     public void pop() {
//         if(s.peek() < minVal) {
//             minVal = 2 * minVal - s.peek();
//         }

//         s.pop();
//     }
    
//     public int top() {

//         if(s.peek() < minVal) {
//             return (int) minVal;
//         }
//         return s.peek().intValue();
//     }
    
//     public int getMin() {
//         return (int) minVal;
//     }
// }


    
    public static void main(String[] args) {
        
    }
}
