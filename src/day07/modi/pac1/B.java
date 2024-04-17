package day07.modi.pac1;

import day04.Dancer;
import day07.modi.pac2.C;
//클래스에는 private나 protected는 못씀!⭐
// public default만 가능!
class B {
    public int z1;
    int z2;
    private int z3;

    void test(){
        A a1 = new A(50);//A클래스 생성자 호출 (PUBLIC)
        A a2 = new A(5.5); //default
//        A a3 = new A(true);  //private라서 안됨!!@⭐

        a1.f1 = 20;   //public
        a1.f2 = 202;   //default
//        a1.f3 = 5000;  //private라서 접근 안됨.!

        a1.m1();
        a1.m2();
//        a1.m3(); //private 안됨
        C c = new C();
        c.y1 = 10; //타 패키지는 public 만 가능!⭐
//        c.y2 = 20;

//        new Dancer(); // default 라서 안됨⭐
                        // 쓰고 싶다면 public이어야함⭐


    }
}
