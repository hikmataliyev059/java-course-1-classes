package az.classes.MixedTasks.MyQueue;

import java.util.function.Supplier;

public class MyQueueApp {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add("hello");
        System.out.println(myQueue.size());
        myQueue.add("bye");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
        System.out.println(myQueue.size());

        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
        int randomValue = randomNumberSupplier.get();
        System.out.println(randomValue);
    }
}
