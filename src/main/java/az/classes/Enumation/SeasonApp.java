package az.classes.Enumation;

public class SeasonApp {

    public static void main(String[] args) {
        System.out.println(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.WINTER);
        System.out.println(SeasonEnum.FALL);
        System.out.println(SeasonEnum.SUMMER);

        System.out.println(SeasonEnum.SUMMER.name());
        System.out.println(SeasonEnum.SUMMER.ordinal());
        System.out.println(SeasonEnum.SUMMER.getAverageTemp());
    }
}
