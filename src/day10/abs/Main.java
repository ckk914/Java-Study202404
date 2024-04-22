package day10.abs;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Dog myDog2 = new Dog();
        Dog myDog3 = new Dog();

        Cat myCat = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();
        Cat myCat4 = new Cat();
//        new Pet();    //abstract을 부모에 걸어서 pet 선언 막음⭐️

        GoldFish goldfish = new GoldFish();

        Pet[] petList = {myDog, myDog2, myDog3, myCat, myCat2, myCat3, goldfish};

        for (Pet pet : petList) {
            pet.eat();
        }
    }
}
