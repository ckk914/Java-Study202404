package day07.player;

//하위 클래스 (sub class)
//: 상위 클래스로 부터 공통 필드와 메서드를 내려받은 클래스
public class Warrior extends Player {
    int rage; //분노게이지

    public Warrior(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp =  50;
        this.rage = 100;
    }

    //현재 캐릭터 정보를 출력

    public void dash(Warrior target){
        System.out.printf("DASH 스킬을 사용합니다.");
    }

    //오버라이딩: 부모가 물려준 메서드를 고쳐 쓰는 것
    // 규칙    : 부모가 물려준 형태를 유지할 것(파라미터, 리턴 타입, 이름)
    // 접근 제한자는 부모보다 more public 할 것!?
    //  ㄴ 부모가 디폴트로 주면 디폴트로 하거나 public 으로 할 수 있다는 뜻

    //오버라이딩 룰을 지켰는지 검증(틀리면 바로 에러뜸)
    @Override
    public void showStatus(){
        //super: 부모로 접근(기존꺼 사용)⭐
        //오버라이딩임..!
        super.showStatus();
        System.out.println("rage = " + rage);
    }

}
