package day09.poly.car;

public class Main {
    public static void main(String[] args) {
        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();
        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();
        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        //다형성을 통해 이종모음 배열을 구현할 수 있음.
        //           = 다른 종류의 클래스들을 하나로 합칠 수 있다.!⭐️
        Car[] cArr = {sonata1,sonata2,tucson1,tucson2,mustang1,mustang2,mustang3,mustang4};
        for(Car car : cArr){
            car.accelerate();
        }
        //다형성 사용은 자제하는 게 좋음
        // 연관성 있는 것끼리 묶기!
        // 별게 다 들어감...
        Object[] sArr= {"abc","def",100,false,new Tucson()};

        Driver driver = new Driver();
        driver.drive(new Mustang());

//        Sonata[] sArr = {sonata1,sonata2,sonata3};
//        for(Sonata sonata:sArr){
//            sonata.accelerate();
//        }
//        Tucson[] tArr = {tucson1,tucson2};


    }
}
