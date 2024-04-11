package day04;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //원래 문법 => 객체이다.
        String myName = new String("홍길동");
        //스트링은 그러나, 쉽게 쓸 수 있게 생략 가능함!

        String inputName = sc.nextLine();
        //String 구조
        char[] nickName = {'축','구','감','상'};
        String nick = new String(nickName);
        // ㄴ String 구조

        System.out.println("nick = " + nick);
        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);
        if (myName.equals(inputName)) {
            System.out.println("두개 같음");
        } else {
            System.out.println("두개 다름");
        }

        Dog e = new Dog();
        Dog f = new Dog();
        System.out.println(e==f); //주소 비교(객체) false

    }
}
