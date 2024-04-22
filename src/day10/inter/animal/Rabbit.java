package day10.inter.animal;

public class Rabbit extends Animal implements Pet {
    @Override
    public void handle() {
        this.age = 10;
    }

    @Override
    public boolean inject() {
        return false;
    }

    //사냥 기능은 없고

    //난폭한 성격

    //애완동물로 가능

}
