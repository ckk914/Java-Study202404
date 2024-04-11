package day04;

public class FieldAndLocal {
    //힙 공간에 살고 있는 aaa
    // 필드는 값을 초기화 하지 않아도
    // 각 타입의 기본값으로 자동 세팅
    // 정수: 0, 실수 0.0, 논리 false,
    // 문자(char) : '', 나머지 : null
    double aaa;
   // ccc: 매개변수(parameter)
    //   ㄴ메서드 호출 시 반드시 필요한 인자값
    //     호출 완료 후 사라짐
    void foo(int ccc){
        //스택 공간에 살고 있는 bbb
        int bbb = 20;
        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
