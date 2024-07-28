package az.classes.MixedTasks;

public class LongProcessing {

    public static void main(String[] args) {
        Long a = 100L;
        Long b = 100L;
        Long c = -129L;  // +127 ile -128 olanda muqayise true eks halda false.
        Long d = -129L;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
