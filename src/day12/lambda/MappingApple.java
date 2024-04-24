package day12.lambda;

import java.util.ArrayList;
import java.util.List;


public class MappingApple {
    // 사과의 색상만 추출
    //필터는 리스트 받아서 리스트가 나간다
    // 맵은 리스트를 받아서 색깔 리스트가 나간다.
    public static List<Color> mappingApplesByColor(List<Apple> basket){
        List<Color> colors = new ArrayList<>();
        for(Apple apple:basket){
            colors.add(apple.getColor());
        }
        return colors;
    }

    public static List<Integer> mappingApplesByWeight(List<Apple> basket){
        List<Integer> weightList = new ArrayList<>();
        for(Apple apple:basket){
            weightList.add(apple.getWeight());
        }
        return weightList;
    }

    //x객체 리스트에서 Y객체 리스트를 반환
    public static <X, Y> List<Y> map(List<X> xList, GenericFunction<X, Y> f) {
        List<Y> mappedList = new ArrayList<>();
        for(X x:xList){
            mappedList.add(f.apply(x));
        }
        return mappedList;
    }
}
