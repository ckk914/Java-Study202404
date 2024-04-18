package day08.singleton;

public class Main {
    public static void main(String[] args) {
        Mypet m1 = Mypet.getInstance();
        Mypet m2 = Mypet.getInstance();
        Mypet m3 = Mypet.getInstance();

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

        m1.setName("초코");
    }
}
