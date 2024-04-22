package day10.abs;

public abstract class Pet {
    String name;
    int age;
    String kind;

    Pet(){

    }

    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    //산책 기능은 필요에 따라 오버라이딩
    // 모두에게 강요할 필요가 없다면 굳이 추상화 하지 않아도 됨
    public void walk(){
        System.out.println("산책은 무조건 공원에서 하세요~");
    }

    //abstract 추상화 : 선언만 함.      <-> final : 상속 못하게 하는 키워드
    //이렇게 해주면 자식은 무조건 해당 메서드를 선언해야함⭐️
    // 강요할 필요가 있으므로 추상화
    public abstract void eat();
    //추상 메서드는 본문이 없는 껍데기 역할
    //자식들에게 기능 이름을 통일 시키기 위한 장치
    //추상 메서드는 추상 클래스 안에서만 선언 가능
    //다만 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 선언 가능
    public abstract void sleep();
}
