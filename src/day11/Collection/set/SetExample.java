package day11.Collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //중복 저장 허용 안함, 순서가 없음,
        //비교적 빠른 저장 속도
        Set<Object> set = new HashSet<>();
        
        boolean flag1 = set.add("김말이");  //true
        set.add("김밥");
        set.add("라면");
        set.add("단무지");
        boolean flag2 = set.add("김말이");    //중복 허용 안함 false

        System.out.println("set = " + set);
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println(set.size());

        //탐색 시 개별 탐색 안됨
        // ㄴ 인덱스 없음
        // 전체 탐색만 가능!!
        for(Object s: set){
            System.out.println("s = " + s);
        }

        set.remove("단무지");
        System.out.println("set = " + set);

        //set은 보통 데이터 중복을 빠르게 제거할때 사용⭐️
        List<Integer> nubers = List.of(3,3,1,1,1,3,3,5,5,5,6,6,7,7,9);

        //set으로 변환
        Set<Integer> numberSet = new HashSet<>(nubers);
        System.out.println("numberSet = " + numberSet);

        //list 로 다시 변환
        nubers = new ArrayList<>(numberSet);
        System.out.println("nubers = " + nubers);

    }
}
