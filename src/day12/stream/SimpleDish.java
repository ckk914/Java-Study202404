package day12.stream;

import java.util.Objects;

public class SimpleDish {
    private final String name;
    private final int calories;

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
    //생성자를 전달받아서 필요 데이터를 뽑아낸다~!⭐️
    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDish that = (SimpleDish) o;
        return calories == that.calories && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories);
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
