package az.classes.MixedTasks;

public class TrimAndIntern {

    public static void main(String[] args) {
        String s1 = "John";
        String s2 = " John ".trim().intern();
        System.out.println(s1 == s2);
    }
}
