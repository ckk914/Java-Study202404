package day11.generic;

public class Banana {
    private int Sweet;

    public Banana(int sweet) {
        Sweet = sweet;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "Sweet=" + Sweet +
                '}';
    }
}
