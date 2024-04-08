package day02;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers= {10,20,30,40};
        int newNumber = 50;
        //push : 맨 끝에 데이터 추가

        //1. 기존 사이즈 보다 1개 더 큰 새로운 배열 생성
        int[] temp = new int[numbers.length+1];
        // 2. 기존 데이터를 새로운 배열로 전부 복사
        System.out.println("numbers:"+Arrays.toString(numbers)); //numbers:[10, 20, 30, 40]
        System.out.println("numbers:"+Arrays.toString(temp)); //numbers:[0, 0, 0, 0, 0]

        for (int i = 0; i <numbers.length ; i++) {
            temp[i] = numbers[i];
        }
        System.out.println("numbers:"+Arrays.toString(numbers)); //numbers:[10, 20, 30, 40]
        System.out.println("numbers:"+Arrays.toString(temp)); //numbers:[0, 0, 0, 0, 0]

        //3. 새 배열의 끝 인덱스에 넣을 데이터 추가하기!
        temp[temp.length-1] = newNumber;
        System.out.println("numbers:"+Arrays.toString(temp)); //numbers:[0, 0, 0, 0, 0]

        //4. numbers에 저장된 주소값을 temp의 주소값으로 변경
        numbers = temp;
        System.out.println("numbers:"+Arrays.toString(numbers)); //numbers:[10, 20, 30, 40]
        System.out.println("numbers:"+Arrays.toString(temp)); //numbers:[0, 0, 0, 0, 0]

        //5. temp는 더이상 배열을 관리하면 안되므로 해제!
        temp = null;
        System.out.println("numbers:"+Arrays.toString(numbers)); //numbers:[10, 20, 30, 40]
        System.out.println("numbers:"+Arrays.toString(temp)); //numbers:[0, 0, 0, 0, 0]

    }
}
