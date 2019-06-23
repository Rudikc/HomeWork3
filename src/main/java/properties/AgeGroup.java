package properties;

public enum AgeGroup {

    TODLER(0, 3),
    PRESCHOOLER(4, 6),
    MIDDLECHILD(6, 10),
    YOUNGTEEN(11, 14);

    private final int lowerCase, higherCase;

    AgeGroup(int lowerCase, int higherCase) {
        this.lowerCase = lowerCase;
        this.higherCase = higherCase;
    }
}
