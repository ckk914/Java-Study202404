package day07.player;

//extends 상속 키워드
public class Hunter extends Player {


    int concentration; // 집중력

    @Override
    public void showStatus(){
        //super: 부모로 접근(기존꺼 사용)⭐
        //오버라이딩임..!
        super.showStatus();
        System.out.println("concentration = " + concentration);
    }

    public Hunter(String nickname) {
        super(nickname);
//        this.nickName = nickname;
//        this.level = 1;
//        this.hp = 50;
        this.concentration = 10;
    }


}
