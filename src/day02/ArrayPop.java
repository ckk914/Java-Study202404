package day02;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        // pop: 배열의 끝 데이터를 삭제하고 꺼내옴!
        // 1. 기존 사이즈보다 1개 적은 사이즈 배열 생성
        int[] temp = new int[numbers.length - 1];
        System.out.println("numbers:" + Arrays.toString(numbers));
        System.out.println("numbers:" + Arrays.toString(temp));

        //2. 원본배열에서 맨 끝인덱스를 제외한 모든 내용 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        System.out.println("numbers:" + Arrays.toString(numbers));
        System.out.println("numbers:" + Arrays.toString(temp));

        int removedNumber = numbers[numbers.length -1 ];

//        3. 주소값 이전
        numbers = temp;
        temp = null;
        System.out.println("=====최종=====");
        System.out.println("numbers:" + Arrays.toString(numbers));
        System.out.println("numbers:" + Arrays.toString(temp));
        System.out.println("삭제한값:" + removedNumber);


    }
}
