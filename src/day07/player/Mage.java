package day07.player;
//extends 상속 키워드
public class Mage extends Player{

    int mana;

    public Mage(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp =  50;
        this.mana = 100;
    }


    public void thunderbolt(Mage targets) {
        System.out.println("썬더볼트");
    }

}

