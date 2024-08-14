package az.classes.MixedTasks;

import az.classes.Exception.Response;

public class ValidateAndGetApp {

    public static void main(String[] args) {
        ValidateAndGet<Integer> result1 = validateAndGet(null);
        System.out.println(result1);

        ValidateAndGet<Float> result2 = validateAndGet(34F);
        System.out.println(result2);

        ValidateAndGet<String> result3 = validateAndGet("hikmet");
        System.out.println(result3);

        Response<String, Integer> hikmetResponse = get("Hikmet", 18);
        System.out.println(hikmetResponse);
    }

    public static <T> ValidateAndGet validateAndGet(T t) {
        if (t == null) {
            return new ValidateAndGet<>();
        }
        return new ValidateAndGet<>(t, t.getClass().getName());
    }
    public static <T, U> Response<T, U> get(T t, U u) {
        return new Response<>(t, u);
    }
}






