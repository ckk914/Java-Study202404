package day09.poly;
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

/**
   object
     l
     A
    / \
   B   C
  /     \
 D      E
 */
public class Basic {

    void test(){
        //다형성 : 객체가 여러 타입을 사용할 수 있다.
        Object x1 = new A();
        A x2 = new B();  // 부모의 타입 A를 쓸수 있다!  ⭐️
        A x3 = new C();

        A x4 = new D();
        A x5 = new E();

        int a = 10;
        double b = a;

        C c = new C();
        A d = c;  //A로 캐스팅 한 것 : 자식이 부모 타입으로 바뀐 것 (업캐스팅)
    }
}
