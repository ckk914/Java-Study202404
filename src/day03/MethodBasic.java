package day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodBasic {
    //자바의 함수는
    //반드시 클래스 블록 내부,
    // 다른 함수 외부에 만들어야함
    //여기도 가능
    //두개의 정수를 전달받아, 합을 리턴하는 함수
    static int add(int n1,int n2){
        return n1+n2;
    }
    //곱하는 함수
    static void multiply(int n1, int n2){
        if(n1>100)return; //탈출 용도!
        System.out.printf("%d x %d = %d\n",n1,n2,n1*n2);
    }
    //n개의 정수를 전달 받아, 그 총합을 반환하는 함수
    //함수 선언부 맨위 double로 해도 에러 안남!
//    static int addAll(int[] numbers){
//        int total =0;
//        for(int n:numbers){
//            total+=n;
//        }
//        return total;
//    }
        static int addAll(int... numbers){
        int total =0;
        for(int n:numbers){
            total+=n;
        }
        return total;
    }
    //2개의 정수를 전달 받아, 사칙연산의 결과를 모두 리턴
    static int[] operate(int n1,int n2){
        int multiply = n1*n2;
        int divide = n1/n2;

        int minus = n1 - n2;
        int plus = n1 + n2;
        return new int[]{plus, minus,multiply,divide};
    }

    public static void main(String[] args) {
       //함수를 호출할 때는 함수 안에서만 가능
          int i30 = add(10,20);
        System.out.println("i30 = " + i30);
        //void 함수는 함수의 결과를 변수에 담을 수 없음.
        //반드시 단독 호출해서 사용
        multiply(5,4);
        Math.random();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] arr ={1,3,4,5,6,7,8};
        int r2 = addAll(arr);
        System.out.println("r2 = " + r2);
        
        int[] Result = operate(2,4);
        System.out.println("Result[2] = " + Result[2]);
    } //end main method

    //여기도 가능

}// end class
