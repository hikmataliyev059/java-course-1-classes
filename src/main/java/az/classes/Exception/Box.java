package az.classes.Exception;

public class Box<T> {

    private T data;
    private double weight;

    public Box(T data, int num) {
        this.data = data;
        this.weight = weight;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isEmpty() {
        return data == null;
    }
}
