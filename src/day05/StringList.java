package day05;

import java.util.Arrays;

//String 배열을 관리하는 객체의 설계도
public class StringList {
    //필드
    //스트링 배열을 필드로 등록
    String[] sArr;




    //배열 내부를 출력하는 메서드
    public String toString() {
        return Arrays.toString(sArr);
    }

    //배열 내부 요소의 수를 알려주는 메서드
    int size() {
        return sArr.length;
    }

    //배열 맨끝 데이터 추가하는 메서드
    void push(String newData) {
        //1개 더 큰 배열 생성
        String[] temp = new String[sArr.length + 1];
        //기존꺼 복사
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        //마지막 데이터 추가
        temp[temp.length - 1] = newData;
        sArr = temp;
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 배열 맨 끝데이터 제거
    void pop() {
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }

    // 중간 삭제 (remove) : 값으로 삭제
    public String remove(String target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length) {
            push(newData);
            return;
        }

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = newData;
        sArr = temp;
    }
    //수정
    public void set(int index,String newData)
    {
        if (index < 0 || index > sArr.length - 1) return;
        sArr[index] = newData;
    }
    //전체 삭제
    public  void clear(){
        sArr = new String[0];
    }
    //배열에 데이터가 하나도 없는지 확인
    public boolean isEmpty() {
        return sArr.length == 0;
        //0이면 true
    }
    //생성자를 통해 스트링 배열을 초기화함
    //생성자
    StringList() {
        sArr = new String[0];
    }
    StringList(String...str) {
        sArr = str;
//        sArr = new String[str.length];
//        for (int i = 0; i <str.length ; i++) {
//            sArr[i] = str[i];
//        }
    }
}// class end
