package day11.generic;

public class Main {
    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple(10));
        //ab.setApple(new Banana(10)); //안됨
        Apple apple = ab.getApple();

        BananaBasket bb= new BananaBasket();
        bb.setBanana(new Banana(15));
        Banana banana = bb.getBanana();

        Basket basket = new Basket();
        basket.setFruit(new Apple(7));

        Basket basket2 = new Basket();
        basket2.setFruit(new Banana(9));

        Object fruit = basket.getFruit(); //꺼내면 사과인지 바나나인지 모름!

        //제네릭 클래스 사용하여 처리
//        제네릭 클래스 : 타입 복제가 가능한 클래스 < >
        Basket<Apple> applebasket = new Basket<Apple>();
        //applebasket.setFruit(new Banana(1));  //사과 전용이라 안됨

        applebasket.setFruit(new Apple(1));
        Apple fruit1 = applebasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<Banana>();
        bananaBasket.setFruit(new Banana(33));
        Banana fruit2 = bananaBasket.getFruit();


    }
}
