package day08.static_;

import day07.modi.pac2.C;

public class Count {

    //사용 제한자 (usage modifier)
    public static int x;        //정적 필드    : 모든 객체가 공유
    int y;                      //인스턴스 필드 : 각 객체별로 따로 관리

    //정적 메서드 static : 모든 객체가 공유하며, 객체 생성 없이 접근 가능
    static void m1(){     //static 은 this.ㅇㅇ 을 쓸 수 없다.⭐️
        System.out.println("static method call!");
        System.out.println("x static = " + x);
        //static 메서드 내부에서는 instance 필드와 메서드를 직접 참조할 수 없다.⭐️
        //ㄴ-> static 은 객체 생성 없이 호출되므로 this 를 가질 수 없기 때문에
//        System.out.println("y = instance" + y); //에러

//        Count c3 = new Count();
//        System.out.println("c3.y = " + c3.y);

//        static 의 경우 누구의 ㅇㅇ인지 명시 해줘야 사용 가능
    }


    //인스턴스 메서드 : 각 객체별로 따로 실행됨
    void m2(){
        System.out.println("instance method call!");
        System.out.println("x static = " + x);
        System.out.println("y = instance" + y);
        m1();
    }
}
