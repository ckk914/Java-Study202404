package day09.poly.car;

public class Driver {
    //Car 라는 상위 타입을 활용한 다형성!⭐️
    public void drive(Car car){

        //instanceof 맞는지 확인
        System.out.println(car instanceof  Sonata);
        String carName = "";
        if(car instanceof Sonata){
            carName = "소나타";
        }else if(car instanceof Tucson){
            carName="투싼";
        }else if(car instanceof Mustang){
            carName = "머스탱";
        }
        System.out.println(carName+ " 운전을 시작합니다.");
        car.accelerate();
    }
}
