package day08.singleton;

public class Main {
    public static void main(String[] args) {
        //3, 공개된 메서드를 통해 미리 만들어둔 단 하나의 객체를 제공
        Mypet m1 = Mypet.getInstance();
        Mypet m2 = Mypet.getInstance();
        Mypet m3 = Mypet.getInstance();

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

        m1.setName("초코");

        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println(m3.getName());

    }
}
