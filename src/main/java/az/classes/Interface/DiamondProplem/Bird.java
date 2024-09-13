package az.classes.Interface.DiamondProplem;

public interface Bird {

    default void sound() {
        System.out.println("From Bird interface: Bird sound");
    }
}
