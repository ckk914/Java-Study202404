package day10.abs;

public class Dog extends Pet {

    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹음");
    }
    @Override
    public void sleep() {
        System.out.println("강아지가 낮잠을 잠");
    }

}
