package az.classes.Queue;

enum Operation {
    Undo,
    Redo,
    Delete,
    Home,
    End,
    Enter,
    Rename;

    public static Operation getRandomOperation() {
        final int random = (int) (Math.random() * Operation.values().length);
        return Operation.values()[random];
    }
}
