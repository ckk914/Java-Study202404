package day07.player;
//extends 상속 키워드
public class Mage extends Player{

    int mana;

    public Mage(String nickName) {
super(nickName);
        //        this.nickName = nickName;
//        this.level = 1;
//        this.hp =  50;
        this.mana = 100;
    }
    public void showStatus(){
        //super: 부모로 접근(기존꺼 사용)⭐
        //오버라이딩임..!
        super.showStatus();
        System.out.println("mana = " + mana);
    }

    public void thunderbolt(Mage targets) {
        System.out.println("썬더볼트");
    }

}

