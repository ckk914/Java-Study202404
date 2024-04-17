package day07.modi.pac2;

import day07.modi.pac1.A;
//import day07.modi.pac1.B; //클래스를 Default로 하면 참조 자체를 못함!

public class C {

    public int y1;
    int y2;
    private int y3;

    void test() {

        A a = new A(100);// public
//        new A(3.14); // default
//        new A(false); // private

        a.f1 = 10; // public
//        a.f2 = 20; // default
//        a.f3 = 30; // private

        a.m1();
//        a.m2();
//        a.m3();
//new B()
    }
}