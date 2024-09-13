package az.classes.Interface.DiamondProplem;

public interface Animal {

    default void sound() {
        System.out.println("From Animal interface: Animal sound");
    }
}
