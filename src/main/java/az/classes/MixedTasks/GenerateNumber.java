package az.classes.MixedTasks;

import java.util.Objects;

public class GenerateNumber<T> {
    private boolean isEven;
    private T data;

    public GenerateNumber(T data, boolean isEven) {
        this.data = data;
        this.isEven = isEven;
    }

    public T getData() {
        return data;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenerateNumber<?> task = (GenerateNumber<?>) o;
        return isEven == task.isEven && Objects.equals(data, task.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEven, data);
    }

    @Override
    public String toString() {
        return "GenerateNumber{data=%s, isEven=%s}".formatted(data, isEven);
    }
}

