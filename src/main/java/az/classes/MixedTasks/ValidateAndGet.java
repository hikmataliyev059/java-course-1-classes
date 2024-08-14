package az.classes.MixedTasks;

import java.util.Objects;

public class ValidateAndGet<T> {

    private T data;

    private String className;

    public ValidateAndGet() {}

    public ValidateAndGet(T data, String className) {
        this.data = data;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidateAndGet<?> result = (ValidateAndGet<?>) o;
        return Objects.equals(data, result.data) && Objects.equals(className, result.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, className);
    }

    @Override
    public String toString() {
        return "ValidateAndGet{className='%s', data=%s}".formatted(className, data);
    }
}
