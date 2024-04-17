package day07.player;

//extends 상속 키워드
public class Hunter extends Player {


    int mana;
    int concentration; // 집중력

    public Hunter(String nickname) {
        this.nickName = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentration = 10;
    }


}
