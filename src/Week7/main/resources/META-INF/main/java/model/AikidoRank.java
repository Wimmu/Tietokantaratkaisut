package Week7.main.resources.META;

public enum AikidoRank {
    BEGINNER(1, "Beginner"),
    INTERMEDIATE(2, "Intermediate"),
    ADVANCED(3, "Advanced"),
    BLACK_BELT(4, "Black Belt");

    private final int value;
    private final String name;

    AikidoRank(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static AikidoRank fromValue(int value) {
        for (AikidoRank rank : AikidoRank.values()) {
            if (rank.getValue() == value) {
                return rank;
            }
        }
        throw new IllegalArgumentException("Unknown rank value: " + value);
    }
}
