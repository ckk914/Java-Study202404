package day07.player;

public class Main {
    public static void main(String[] args) {
/**
 *             Object
 *               ㅣ
 *            player
 *           /    l   \
 *        워리어 메이지 헌터
 *
 */

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h= new Hunter("스티븐호킹");

        w.showStatus();
        w.exp = 10;
        m.showStatus();
        h.showStatus();

    }
}
