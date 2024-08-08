package az.classes.Exception;


public class EnableApp {

    public static void main(String[] args) {
        EnableOne<Integer> result = validateAge(24);
        System.out.println(result);

        EnableOne<Double> result1 = validateAge(24D);
        System.out.println(result1);

        EnableTwo<Integer, String> result3 = get2(24, "elvin");
        System.out.println(result3);
    }

    public static <T> EnableOne validateAge(T t) {
        if (t == null) {
            return new EnableOne<>();
        }
        return new EnableOne<>(t, t.getClass().getName());
    }

    public static <T, U> EnableTwo<T, U> get2(T t, U u) {
        return new EnableTwo<>(t, u);
    }
}
