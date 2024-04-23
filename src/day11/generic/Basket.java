package day11.generic;

//제네릭 클래스 : 타입 복제가 가능한 클래스 <대문자>
public class Basket<F> {
    private  F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
