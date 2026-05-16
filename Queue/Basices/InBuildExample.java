import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuildExample {
    
    public static void main(String[] args) {
    //     Queue<Integer> queue = new LinkedList<>();
    //     queue.add(3);
    //     queue.add(6);
    //     queue.add(5);
    //     queue.add(19);
    //     queue.add(1);
        
    //     System.out.println(queue.remove());
    //     System.out.println(queue.remove());
    //     System.out.println(queue.remove());
    //     System.out.println(queue.remove());
    // }


    // DEQUEUE ->
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(78);
    deque.addLast(98);
    deque.removeFirst();

    }
}
