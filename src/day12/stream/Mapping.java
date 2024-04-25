package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;
//map : 리스트에서 원하는 데이터만 추출
// original : [{},{},{},{},{}]
//filter    : [{},{},{}]
//map       : ["","","","",""]

public class Mapping {
    public static void main(String[] args) {

        System.out.println("**********************");
        //요리 이름만 추출
        List<String> nameList =
                menuList
                        .stream()
                        .map(dish -> dish.getName())
                        .collect(Collectors.toList());
        System.out.println(nameList);

        System.out.println("**********************");

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );
        // [ ?, ?, ? ...]
        List<Integer> collected = words.stream()
                .map(word->word.length())
                .collect(Collectors.toList()); //Stream을 사용해 List로 변환
        System.out.println(collected);

        System.out.println("####################");

        //원하는 위치 글자 출력
        List<Character> characterList = words.stream()
                .map(word->word.charAt(0))
                .collect(Collectors.toList());
        System.out.println(characterList);

        System.out.println("####################");

        // 메뉴 목록에서 메뉴이름과 칼로리를 추출해서
        // 새로운 객체에 포장하고 싶음
        /*
               const menuList = [
                    {
                        name: 'pork',
                        isVegeterian: false,
                        calories: 800,
                        type: 'MEAT'
                    },
                    ...
               ];
               const nameList = ['pork', 'beef', 'chicken' ...];

               const menuList = [
                    {
                        name: 'pork',
                        calories: 800
                    },
                    {
                        name: 'beef',
                        calories: 700
                    },
                    ...
               ];
         */

        ///여러개 데이터 속성 중
        //보고 싶은게 있으면
        //클래스 새로 만들어서 보여줘라~! ⭐️
//        List<SimpleDish> simpleDishList =
//        menuList
//                .stream()
//                .map(dish->new SimpleDish(dish.getName(),dish.getCalories()))
//                .collect(Collectors.toList());
        List<SimpleDish> simpleDishList =
                menuList
                        .stream()
                        .map(dish -> new SimpleDish(dish))
                        .collect(Collectors.toList());
        simpleDishList.forEach(sd -> System.out.println(sd));

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
         */

        // 단 타입은 MEAT의 경우 육류
        //FISH는 어류, OTHER는 기타  라고 저장
        List<DishDetail> dishDetailList = 
                menuList.stream()
                .filter(d->d.getCalories()>500)
                .map(dish->new DishDetail(dish))
                .collect(Collectors.toList());
        System.out.println("dishDetailList = " + dishDetailList);

        System.out.println("=================");
        //메뉴 목록에 있는 요리들의 총 칼로리 수 구하기
        int sum = menuList.stream()
                .mapToInt(d -> d.getCalories())     //int로 받음
                .sum();                             //총합 반환
        System.out.println("sum = " + sum);
        System.out.println("=================");
        
        //육류 메뉴 평균 칼로리
        double averageCarories = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()          //평균 계산
                .getAsDouble();     // double로 받음

        System.out.println("averageCarories = " + averageCarories);

        
    }
}
