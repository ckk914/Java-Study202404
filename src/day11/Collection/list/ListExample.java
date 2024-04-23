package day11.Collection.list;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class ListExample {
    public static void main(String[] args) {

//        String[] foodList2= new String[0];
//        String foodList = new StringList();
        //         ll
        ArrayList<String> foods = new ArrayList<>();
//                 ll
//        List<String> foods = new ArrayList<>();
//        foods.remove(3);
        
        //데이터 add
        foods.add("짜장면");
        foods.add("볶음밥");
        foods.add("파스타");
        System.out.println(foods);

        //중간 삽입 add(index,요소);
        foods.add(1,"짬뽕");
        System.out.println(foods);

        //갯수 확인
        int size = foods.size();
        System.out.println("size = " + size); //4

        //인덱스 확인
        int index = foods.indexOf("파스타");
        System.out.println("index = " + index);

        //포함 확인
        boolean flag = foods.contains("파스타");
        System.out.println("flag = " + flag);

        //삭제 
        foods.remove(0);
        foods.remove("파스타");
        System.out.println("foods = " + foods);
        
        //수정
        foods.set(0,"치킨");
        System.out.println("foods = " + foods);
        //가져오기
        String s = foods.get(1);
        System.out.println("s = " + s);

        //반복문 처리
        for (int i = 0; i <foods.size() ; i++) {
            System.out.println(foods.get(i)+" 맛있따");
        }

        System.out.println("==========");
        for(String food: foods){
            System.out.println("food = " + food);
        }

        //전체 삭제
        foods.clear();
        System.out.println("foods = " + foods);

        //비었는지 체크
        System.out.println(foods.isEmpty());
        
        //리스트에 초기값 넣고 시작하기
        int[] arr = {10,20,30,1,2,4,7,11};
        //    ll
        List<Integer> numbers = new ArrayList<>(List.of(10,20,30,1,2,4,7,11));
//        List<Integer> numbers = new ArrayList<>();
        System.out.println("numbers = " + numbers);

        //오름차순 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);
        
        //내림차 정렬
        numbers.sort((Comparator.reverseOrder()));
        System.out.println("numbers = " + numbers);

    }
}
