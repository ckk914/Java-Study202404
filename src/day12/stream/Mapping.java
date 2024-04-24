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


    }
}
