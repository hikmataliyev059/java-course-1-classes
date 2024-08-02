package az.classes.PassingValues.PassingByReference;

public class PassingByReference {

    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 5;
        modifyObject(obj);
        System.out.println("obj.value inside the main method: " + obj.value);
    }

    public static void modifyObject(MyObject object) {
        object.value = 10;
    }
}

