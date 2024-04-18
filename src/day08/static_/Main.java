package day08.static_;
import static util.SimpleInput.input;
public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();

        c1.y = 10;
        c2.y = 20;

//        c2.x = 99;  //static 은 1개로 사용되므로 그냥 클래스 명.변수로 접근한다!⭐️
//        c1.x = 50;
        Count.x = 55;  // static 특징.1 => 그냥 클래스 명.변수로 접근한다!⭐️
                       // static 특징.2 => 객체 생성 없이 접근 가능

        Count.m1();   // static 메서드도 바로 클래스명.함수명 으로 호출 가능!️ ⭐️
        c1.m2();

        System.out.println("c1.x = " + c1.x);
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.x = " + c2.x);
        System.out.println("c2.y = " + c2.y);

        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        Calculator.calcArea(5);

        redCal.paint("빨강");
        blueCal.paint("파랑");
//        String a = input("입력");
        System.out.println("======");
        System.out.println(Person.nation);
        Person gap = new Person("갑돌이", 20);
        System.out.println(gap.name);
        System.out.println(gap.age);
        System.out.println(gap.nation);




    }
}
