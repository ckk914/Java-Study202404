package day10.inter;

public interface SmartPhone {
    //인터페이스는 처음 설계부터 객체를 만들지 않을 것을 가정했으므로
    //생성자 및 필드를 선언할 수 없음!!⭐️
    //상수는 선언 가능!!
    //public static final  이게 디폴트이다~!
    public static final int age= 10;

    //스펙 물어보는 기능
    //public abstract 안써도 자동으로 들어간다~!🌟
    // 기본적으로 추상화 상태이다~!
    void information();
    //충전 기능
    void charge();
    //카메라 기능
    void camera();

}
