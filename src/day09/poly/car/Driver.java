package day09.poly.car;

public class Driver {
    //Car 라는 상위 타입을 활용한 다형성!⭐️
    public void drive(Car car){
        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
}
