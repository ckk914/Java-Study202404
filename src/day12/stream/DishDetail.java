package day12.stream;

public class DishDetail {
    private String dishName;
    private  final String type;

    //생성자
    public DishDetail(Dish dish) {
        this.type = dish.getType().getDesc();
        this.dishName = dish.getName();
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "dishName='" + dishName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
