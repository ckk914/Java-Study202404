package day01;

import java.sql.SQLOutput;

public class DataType {
    public static void main(String[] args) {
        //정수만 가능한 타입들
        //입력한 값은 각 타입별 최대값
        // 1Byte = 8bit
        // 1bit = 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8+ 4+ 2+ 1 = 15
        // 0 1111111 => 64+32+16+8+4+2+1 = 127

        byte a = 127;           //1byte
        short b = 32767;        //2byte 16bit -> 1개는 부호 2**15

        int c = 2147483647;     //4byte 2**31
        long d = 2147483647;    //8byte 2**31
//       범위보다 더 큰 범위 잡는 방법
        long dd = 214748364784328747L; //8byte
        System.out.println(dd);
//        정수는 : 그냥 int 써라
        //<-----------------
        float e = 3.1432f;           //4byte
        double k = 3.143274343443;  //8byte
        double g = 100;
        //실수는 :그냥 더블 써라

        System.out.println("e= " + e);
        System.out.println("k = " + k);
        System.out.println("g = " + g);

        boolean flag1 = false;
        boolean flag2 = 10 > 5;
        int i = 100;
        double v = 3232.2323;

        String userName = "조경곤";
        String aa = "aa";

        double random = Math.random();
        System.out.println("random = " + random);

        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

        //문자형 char  2byte 0~65536
        char text = 'a';
        char text2 = '가';
        char text3 = 65;
        char text4 = 44033;
        char text5 = 25000;
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);

        //문자열 : 문자 배열
//        ['안','녕','하','세','여']
        char[] hello = {'안', '녕', '하', '세', '여'};
        System.out.println("hello = " + new String(hello));

        String hello2 = "안녕하세요";


    }
}
