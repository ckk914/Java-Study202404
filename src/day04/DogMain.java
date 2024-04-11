package day04;

public class DogMain {
    public static void main(String[] args) {

        Dog choco = new Dog("초코");
        Dog ppobbi = new Dog("뽀삐");

        choco.petInfo();
        System.out.println("================");
        ppobbi.inject();
        ppobbi.petInfo();

        System.out.println("choco = " + choco);
        System.out.println("ppobbi = " + ppobbi);
    }
}
