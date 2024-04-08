package day01;

import java.sql.SQLOutput;

public class TypeCasting2 {
    public static void main(String[] args) {
        //int 이하의 사이즈를 가진 타입은 연산 시 결과가 자동으로 int로 캐스팅됨
        char b1 = 'A';  //65
        char b2 = 'C';  //67
        byte b3 = 100;
        byte b4 = 50;

        int r3 = b3 + b4;
        System.out.println(r3);

        System.out.println(b1+b2); //132

        char cc = 'A';
        int plusNum = 3;
        char r4 = (char) (cc + plusNum); //D
        System.out.println("r4 = " + r4);

    }
}
