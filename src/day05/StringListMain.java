package day05;

public class StringListMain {
    public static void main(String[] args) {
        StringList foods = new StringList();
        StringList userNames = new StringList();
        //배열 내부 데이터 수 확인 (객체안의 배열에 대한)
//        System.out.println(foods.sArr.length);
        System.out.println(foods.size());


        //배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");
        userNames.push("박가");
        foods.push("탕수육");

        //데이터 삭제
        foods.remove("짬뽕");

        //자료 중간 삽입
        userNames.push("김철수");
        userNames.push("홍길동");

        userNames.insert(1,"뽀로로");
        foods.insert(1,"마라탕");

        //배열 데이터 수정
        foods.set(0,"김치볶음밥");
        userNames.set(1,"대길이");
        //배열 데이터 전체 삭제
        foods.clear(); // foods 배열 내부가 전체 삭제
        //배열 데이터 한개라도 있는지 확인
        boolean flag = foods.isEmpty();
        System.out.println("flag = " + flag);
        //배열 출력
        System.out.println("userNames = " + userNames);
        System.out.println("foods = " + foods);

        StringList hobbies = new StringList("축구","영화감상","음악감상");
        hobbies.push("수영");
        System.out.println(hobbies);
    }
}
