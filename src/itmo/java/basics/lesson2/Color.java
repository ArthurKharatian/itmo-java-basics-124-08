package itmo.java.basics.lesson2;

public enum Color {

    WHITE("Белый"),
    BLUE("Голубой"),
    DARK_BLUE("Синий"),
    BLACK("Черный"),
    GREEN("Зеленый");

    private final String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
