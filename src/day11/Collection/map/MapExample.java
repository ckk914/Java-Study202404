package day11.Collection.map;

import day09.book.Book;
import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //선언
        Map<String, Object> map = new HashMap<>();

        //데이터 추가 : put()
        map.put("지갑잔액",500);
        map.put("좋아하는 자동차",new Mustang());
        map.put("저녁 메뉴","계란볶음밥");

        HashMap<String,Object> emp = new HashMap<>();
        emp.put("empName","낌철수");
        emp.put("empAge",30);

        System.out.println(map.size());
        
        int money = (int)map.get("지갑잔액");
        System.out.println("money = " + money);
        
        //중복된 키를 저장하면 값이 수정된다.
        map.put("지갑잔액",999);
        System.out.println(map);
        
        //map의 반복 처리   // 키셋 : 키만 출력 함 ⭐️
        for(String s :map.keySet()){
            System.out.println("key = " + s);
            System.out.println("Value = " + map.get(s));
            
        }
    }
}
