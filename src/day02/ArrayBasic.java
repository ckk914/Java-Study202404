package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        //배열의 특징
        // 1. 동종 모음 구조 : 같은 타입의 데이터만 배열에 담을 수 있음
        //      ㄴ 같은 타입만 담아라..
        // 2. 크기가 불변함: 크기가 동적으로 늘이거나 줄일 수 없음

        //배열의 생성 순서

        // 1. 배열 변수 선언
        int[] numbers;

        // 2. 배열의 객체를 생성
        numbers = new int[5];  //방 갯수 지정
        System.out.println("numbers = " + numbers);
//        numbers = [I@5ebec15    주소값이 찍힌다! 방의 위치를 저장하고 있음.!

        // 3. 배열 값 초기화
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;
//        numbers[5] = 100;
        System.out.println("numbers.length = " + numbers.length);
        //배열 순회
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }
        //==========================================================
//        배열 순회 forEach
        for(int n : numbers){
            System.out.println("n = "+n);
        }
        //배열 내부 간결하게 출력
        System.out.println(Arrays.toString(numbers));

        //배열 한번에 만들기
        int[] pointList = new int[]{10,20,30,40};
        System.out.println(Arrays.toString(pointList));
        //만약 배열 변수 선언과 동시에 값을 초기화한다면
        // new Type [] 생략 가능  ⭐초기화때만 생략가능임.!
        String[] pets = new String[]{"멍멍이","짹짹이","애옹이"};
        pets = new String[]{"zzz","fff"};

        //배열에 값을 안넣고 생성만 하면?
        // -> 각 타입의 기본값으로 미리 값을 넣어놓음
        //기본값: 정수 0 실수 0.0 , 논리 false 문자 : 공백 , 기타 = null
        byte[] bArr = new byte[3];
        System.out.println("Arrays.toString((bArr)) = " + Arrays.toString((bArr)));
        System.out.println(bArr.length); //3

        double[] bArr2 = new double[3];
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5];

        System.out.println(Arrays.toString(bArr2));  //[0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(dArr));   //[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(blArr));  //[false, false, false, false]
        System.out.println(Arrays.toString(sArr));  //[null, null, null, null, null]


    }
    
    static int[] getNumbers(){
        return new int[]{50,30,10};
    }
}
