package day10.abs;

public class Cat extends Pet{

    public Cat(){
        super();
    }

    @Override
    public void eat(){
        System.out.println("고양이는 생선을 먹음");
    }
    @Override
    public void sleep(){
        System.out.println("고양이 낮잠");
    }
}
