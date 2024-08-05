package az.classes.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class StackApp {
    private static final Deque<Operation> stack = new LinkedList<>();

    public static void main(String[] args) {
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        doOperation();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
        ctrlZ();
        System.out.println(stack);
    }

    public static Operation doOperation() {
        stack.add(Operation.getRandomOperation());
        return stack.peek();
    }

    public static Optional<Operation> ctrlZ() {
        if (!stack.isEmpty()) {
            return Optional.of(stack.removeLast());
        }
        return Optional.empty();
    }
}
