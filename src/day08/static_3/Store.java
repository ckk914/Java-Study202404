package day08.static_3;

public class Store {
//    2. **클래스 `Store` 생성**
//            - 속성:
//            - `totalSales` (총 판매액, 정수형, static 변수)
//            - 메소드:
//            - `addSale(int amount)`: 판매액을 총 판매액에 추가하는 static 메소드.
//        - `getTotalSales()`: 현재까지의 총 판매액을 반환하는 static 메소드.
private static int totalSales; //총판매액

//    판매액을 총 판매액에 추가하는 static 메소드.
    static void addSale(int amount){
        totalSales+=amount;

    }
    // 총액 출력
    public static String getTotalSales() {
        return  Integer.toString(totalSales);
    }
}
