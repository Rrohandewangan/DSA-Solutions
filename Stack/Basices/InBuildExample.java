import java.util.Stack;

public class  InBuildExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(76);
        stack.push(45);
        stack.push(17);
        stack.push(98);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }

}