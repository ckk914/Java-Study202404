package day08.gisa;

public class Child extends Parent {

    private String name;

    public Child() {
        this("홍길동");                //나의 또다른 생성자로 가랏
        System.out.println("Child() call!");
    }

    public Child(String name) {
//        super();        //생략되어 있음.!⭐️
        this.name = name;
        System.out.println("Child(String) call!");
    }

    void aaa(){
        bbb();
        System.out.println("aaa");
    }
    void bbb(){
        System.out.println("bbb");
        ccc();

    }
    void ccc(){
        System.out.println("ccc");
    }
//    Parent(String) call!"
//    Parent() call!"
//            System.out.println("Child(String) call!");
//            System.out.println("Child() call!");

}
