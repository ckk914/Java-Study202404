package day01;

import com.sun.tools.javac.Main;

public class RandomExample {
    public static void main(String[] args) {

        //연산자 우선순위
        // 단항(++, --, !) > 이항(*, / , %...) > 삼항(?:) > 대입(=)
        int a = 10;
        int b= ++a -10 *3;
        
//        자바 난수 만들기
//        Math.floor(Math.random() *y-x+1) +x
//       자바에서는 Math.floor 대신 (int)캐스팅으로 써라.!
        double rn = (int)(Math.random() *10) + 1;
        System.out.println("rn = " + rn);
    }

}
