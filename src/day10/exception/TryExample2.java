package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *      Object
         *        l
         *      Throwable
         *      /   \
         *   Error  Exception (예외 정보를 가지고 있는 객체)
         *
         */
        try {
            System.out.println("정수1: ");
            int n1 = Integer.parseInt(sc.next());   //에러 잘 나는 구간 : NumberFormatException 숫자 포멧 문제

            System.out.println("정수2: ");
            int n2 = sc.nextInt();                  // InputMisMatchException 정수 아닌 경우

            int result = n1/ n2;                    //ArithmeticException  0 나누기 에러
            System.out.println("result = " + result);

            String s= null;
            s.equals("hello");

        } catch (InputMismatchException e) {
            System.out.println("정수가 아닌가봐요");
//            throw new RuntimeException(e+"정수를 넣어야져");
        }catch (NumberFormatException e){
            System.out.println("문자로 변환할 수 없는 숫자입니다ㅣ");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); // 에러의 로그를 띄움 = 개발 시에 유용 ⭐️
        }catch (Exception e){
            System.out.println("알 수 없는 에러입니다.");
        }

        //에러는 구체적으로 적는게 좋다!

        System.out.println("프로그램 정상 종료!");
    }
}
