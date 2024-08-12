package az.classes.MixedTasks;

public class StaticMethodExample {

    // Static method
    public static int collect(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 1. Calling a static method directly from the class
        int result1 = StaticMethodExample.collect(5, 10);
        System.out.println("Result called from class name: " + result1);

        // 2. Calling a static method by creating an object
        StaticMethodExample obj = new StaticMethodExample();
        int result2 = obj.collect(20, 30);
        System.out.println("Result called from object name: " + result2);
    }
}
