package az.classes.Enumation;

public enum SeasonEnum {
    SPRING(24.5), SUMMER(36.7), FALL(98.4), WINTER(-23.4);

    private final double averageTemp;

    SeasonEnum(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }
}
