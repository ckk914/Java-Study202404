package day07.inherit;

public class ElectronicProduct {

    public String productName;    // 제품명
    public double price;         // 가격
    public String manufacturer;  //제조사

//     - 생성자: 모든 속성을 매개변수로 받아 초기화합니다.
//    public ElectronicProduct(String productName, double price, String manufacturer) {
//        this.productName = productName;
//        this.price = price;
//        this.manufacturer = manufacturer;
//    }

//        - `displayInfo()`: 제품의 정보를 출력하는 메소드. 출력 예: "Samsung TV, 가격: 2000000원, 제조사: Samsung"
    public  void displayInfo(){
        System.out.printf("제품명: %s, 가격 %.3f, 제조사: %s ",productName,price,manufacturer);
//        System.out.println("productName = " + productName);
//        System.out.println("price = " + price);
//        System.out.println("manufacturer = " + manufacturer);
    }

}
