package day12.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {

    /**
     * @solution - try1: 사과바구니 안에서 색상이 녹색인 사과들만 필터링하고 싶어!
     * @param basket : 다양한 사과가 들어있는 리스트
     * @return - basket에서 녹색사과만 필터링한 리스트
     * @problem - 다른 색깔 필터하기엔 문제가 있다!
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        // 녹색사과만 담을 바구니 생성
        List<Apple> greenApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    /**
     * @Solution = try2 : 색상을 파라미터화 하여, 원하는 컬러의 사과를 필터링한다~!
     * @problem  = 필터 기준이 색상이 아니라, 무게 기준이라면???!
     * @param basket
     * @param color = 원하는 필터링 색상
     * @return
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket,Color color) {

        // 녹색사과만 담을 바구니 생성
        List<Apple> filteredApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    //
    //필터링 조건을 파라미터화 할수는 없을까?

    /**
     * @Problem = 필터링 대상이 사과가 아니라, 오렌지면? 학생이면?
     * @Solution = try3 동작(메서드)을 파라미터로 만든다.
     * @param basket
     * @return
     */
    public static List<Apple> filterApples(List<Apple> basket,ApplePredicate p){
        // 녹색사과만 담을 바구니 생성
        List<Apple> filteredApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (p.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution = try4 = 여러 객체들을 필터링
     * @param basket
     * @param p
     * @return
     */
    //T든 다른 글자든 상관없다~!
    // 관례상 한글자
    public static <T> List<T> filter(List<T> basket,GenericPredicate<T> p){
        // 녹색사과만 담을 바구니 생성
        List<T> filteredList = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (T t : basket) {
            if (p.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}