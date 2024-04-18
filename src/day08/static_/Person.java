package day08.static_;

public class Person {
    String name;    //이름
    int age;       //나이
    static String nation; //국가

    //정적 초기화자 (static initializer)⭐️
    //static 필드의 생성자 같은 역할 (static 필드 초기화 담당)
    static {
        nation = "대한민국";
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
//        this.nation = "대한민국";

    }
}
