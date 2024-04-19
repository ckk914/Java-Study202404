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

    public void thunderbolt(Player ...targets) {
        for(Player st : targets){
            if(st == this) continue;
            // 10부터 15까지의 랜덤 수 생성
            int randomNum = 10+ (int)(Math.random() * ((15 - 10) + 1));
//            System.out.println(randomNum);
                st.hp -=randomNum;
            System.out.printf("%s는 %d 데미지를 입습니다. 남은 체력: %d\n",st.nickName,randomNum,st.hp);
        }
        System.out.println("썬더볼트");
    }

}

