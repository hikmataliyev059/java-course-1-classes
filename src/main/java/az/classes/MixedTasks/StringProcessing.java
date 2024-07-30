package az.classes.MixedTasks;

public class StringProcessing {

    public static void main(String[] args) {
        String s1 = "salam";
        final String s2 = "sa";
        String s3 = "lam";
        String s4 = "salam";

        System.out.println(s1 == s4);
        System.out.println(s1 == s2 + s3);
        System.out.println(s1 == s2 + "lam");
    }
}
