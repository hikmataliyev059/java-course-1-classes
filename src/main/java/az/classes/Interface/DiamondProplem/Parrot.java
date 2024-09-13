package az.classes.Interface.DiamondProplem;

public class Parrot implements Animal, Bird {

    @Override
    public void sound() {
        Bird.super.sound();
    }
}
