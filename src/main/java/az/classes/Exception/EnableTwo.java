package az.classes.Exception;

import java.util.Objects;

public class EnableTwo<T, U> {

    private final T t;
    private final U u;

    public EnableTwo(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnableTwo<?, ?> enable1 = (EnableTwo<?, ?>) o;
        return Objects.equals(t, enable1.t) && Objects.equals(u, enable1.u);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, u);
    }

    @Override
    public String toString() {
        return "EnableTwo{t=%s, u=%s}".formatted(t, u);
    }
}
