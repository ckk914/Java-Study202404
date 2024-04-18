package day08.protec.pac1;

public class B {
    void test(){
        A a = new A();  // public 생성자
        A a1 = new A(10); //protected
        A a2 = new A(3.3); //default

        a.f1 = 10; a.f2 = 30;
        a.m1(); a.m2();
    }
}
