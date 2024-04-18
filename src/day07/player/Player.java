package day07.player;

//상위 클래스(suPER CLASS)
// : 공통 속성(field)과 기능(method) 을 가진 부모 클래스
public class Player extends Object{
    //공통 넣기!
    String nickName;
    int level;
    int hp;
    int exp;

    Player(String nickName){
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public void showStatus(){
        System.out.println("\n====== Charater's Info=======");
        System.out.println("nickName = " + nickName);
        System.out.println("level = " + level);
        System.out.println("hp = " + hp);
    }
}
