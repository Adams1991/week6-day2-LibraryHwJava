public enum GenreType {
    HORROR("Scary"),
    ROMANCE("Kisses"),
    COMEDY("Haha");

    private final String value;

    GenreType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
