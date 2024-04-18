package day08.final_;

class Child extends Parent{
    @Override
    void sing(){
        System.out.println("비비크림 ㅂㅂㅂ");
    }

//    @Override
//    void dance(){
//        System.out.println("춤을 땅땅땅");
//    }
}
public class Parent {
    void sing(){
        System.out.println("노래를 랄랄랄");
    }
    protected final void dance(){
        System.out.println("댄스를 하하하");
    }
}
