package day08.super_;

public class Child extends Parent{
//    int a;
//    double b;  //a,b를 헷갈리게 굳이 만들 필요는 없다.⭐️
    boolean c;

    Child(){
//        super();  기본으로 있음. 생략되어 있는 상태임!
        this(100); //첫줄에 this가 있으면 super를 생성 안함 : this : 자신의 다른 생성자로 가쟈⭐️
        System.out.println("Child 클래스의 생성자 호출!");
        this.c= true;
    }
    Child(int x){
//        여기서 super();가 생략되어 있음.🌟
        System.out.println("Child 클래스의 2번째 생성자 호출");
    }

    void childMethod(){
        System.out.println("a = "+ this.a); //부모
        System.out.println("b = "+ this.b); //부모
        System.out.println("c = " + this.c); //나
    }
}
