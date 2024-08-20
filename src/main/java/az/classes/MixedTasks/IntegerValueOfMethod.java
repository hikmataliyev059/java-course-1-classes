package az.classes.MixedTasks;

public class IntegerValueOfMethod {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf(200);

        System.out.println(i1 == i2 && i3 == i4);
        System.out.println(i1 == i2 & i3 == i4);
        System.out.println(i3 == i4 && i1 == i2);
        System.out.println(i3 != i4 & i1 != i2);
    }
}
