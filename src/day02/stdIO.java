package day02;

import java.io.IOException;
import java.util.Scanner;

public class stdIO {
    //표준 입출력 : 키보드와 모니터 출력
    public static void main(String[] args) throws IOException {
        String name = "김철수";

        //%s : 문자열 포맷팅
        //%d : 정수
        //%f : 실수
        //%c : 단일 문자
        System.out.printf("%s의 강아지\n",name);
        System.out.printf("%s의 고양이\n",name);

        //자바에서 키보드 입력 받기
//        int read = System.in.read();
//        System.out.println("read = " + read);
//         ㄴ한글자 들어감 아스키로 나옴
        //sc 엔터 치면 자동으로 import 만들어줌
        Scanner scan = new Scanner(System.in); //입력 준비

        //문자 입력 받기
        System.out.printf("이름: ");
        String s = scan.nextLine();
        System.out.println("s = " + s);

        //정수 입력 받기
        // 문자 입력 받고, 정수로 변환 !
        System.out.print("출생년도: ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);
    }
}

