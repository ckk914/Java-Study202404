package day08.protec.pac2;

import day08.protec.pac1.A;
//A를 상속
public class D extends A {

    D(){
//        super(); //public   ok
//        super(5.5); //default 안됨.
        super(100);
        super.f1 = 100;
//        super.f2 = 200; //안됨
    }
    void test(){
        A a = new A();
//        f1= 10; f2= 30;
//        m1();m2();
    }
}
