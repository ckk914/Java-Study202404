package day11.api.lang;

public class Wrapper {

    //기본값은 차이가 있다.!
    private int number1;        //기본값 0
    private Integer number2;    //기본값 null

    public Wrapper() {
        this.number2 = 0; //기본값 세팅이 필요하다!⭐️
    }

    public static void main(String[] args) {

        //primitive type 기본 타입, 기초 타입, 원시타입
        //byte, short, int , long, boolean, float, double, char


        //Wrapper type 기본타입을 객체로 포장
        //Byte, Short, Integer, Long, Boolean, Float, Double. Character
        Integer a= 10;  //그냥 인트구나 생각하면 된다.!
        a.toString();
        Character c = 'a';
        c.toString();
    }
}
