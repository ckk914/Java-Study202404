package day08.final_;

public class Student {
    String name;
    final String ssn; // 주민번호  //final 쓸때 값을 미리 넣어야함!⭐️

    //final을 쓰면 값을 못바꾼다!⭐️ 국적 고정 => 이제 못바꿈.
    static final String nation = "대한민국"; //국가

    Student(String ssn){
        this.ssn = ssn;  //생성자를 통하여 final 값을 고정시켜버린다.⭐️
    }


}
