package az.classes.Exception;


import java.util.Objects;

public class EnableOne<T> {

    private T data;

    private String className;

    public EnableOne() {
        this.data = data;
        this.className = className;
    }

    public <T> EnableOne(T t, String name) {}


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
        EnableOne<?> enable = (EnableOne<?>) o;
        return Objects.equals(data, enable.data) && Objects.equals(className, enable.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, className);
    }

    @Override
    public String toString() {
        return "EnableOne{className='%s', data=%s}".formatted(className, data);
    }
}
