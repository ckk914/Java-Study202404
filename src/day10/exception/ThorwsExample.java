package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThorwsExample {
    //정수를 입력받아 리턴하는 매서드
    //throws InputMismatchException 에러 나면 던집니다~!
    public int inputNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            return num;

    }
    //문자열을 정수로 변환하는 매서드
    public  int convert(String str) throws NumberFormatException{

            int n = Integer.parseInt(str);
            return n;

    }
}
