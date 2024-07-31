package az.classes.MixedTasks;

public class StringConcatenation {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message);

        StringBuilder bs = new StringBuilder("Hello");
        bs.replace(1, 2, "Java");
        System.out.println(bs);
    }
}
