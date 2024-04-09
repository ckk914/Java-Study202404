package day02;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr ={10, 50,90,100,150};
        int newNumber = 66;
        int targetIndex = 2;

        //✨중간 삽입 알고리즘
        //50과 90 사이에 66을 삽입
        
        //1. 사이즈가 1개 더 큰 배열 생성
        int[] temp = new int[arr.length+1];
        //2. 기존데이터 복사 temp <- arr
        for (int i = 0; i < arr.length ; i++) {
            temp[i] = arr[i];
        }
        //3. 삽입 위치에서 데이터 뒤로 1칸씩 이동
        //   이동 순서는 끝에서 부터 시작해야함
        for (int j = temp.length-1; targetIndex <j ; j++) {
            temp[j] = temp[j-1];
        }
//        temp[5]= temp[4];
//        temp[4]= temp[3];
//        temp[3]= temp[2];
        // 4. 새로운 데이터를 타겟 인덱스자리에 복사
        temp[targetIndex]= newNumber;
        System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));

        //5. 주소값 이전
        arr = temp;
        temp = null;

    }
}
