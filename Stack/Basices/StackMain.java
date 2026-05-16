public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(3);

        stack.push(76);
        stack.push(45);
        stack.push(17);
        stack.push(98);
        stack.push(14);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}
