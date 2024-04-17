package day07.encap;

import java.time.LocalDate;

public class Car {
//            - 자동차의 브랜드(brand), 모델(model), 연식(year)을 캡슐화하는 `Car` 클래스를 만드세요.
//            - 모든 필드는 private로 선언하고, 각 필드의 정보를 반환하거나 설정하는 getter와 setter 메소드를 포함하세요.
//            - setter 메소드에서는 유효하지 않은 입력(예: 미래의 연식)을 거부할 수 있도록 검증 로직을 추가하세요.
    private String brand;   //브랜드
    private String model;   //모델명
    private int year;       //연식

    //브랜드 설정
    public void setBrand(String brand) {
        if(brand != null) {
            this.brand = brand;
        }
    }
    //모델명 설정
    public void setModel(String model) {
        if(model != null){
            this.model = model;
        }
    }
    //연식 설정
    public void setYear(int year) {

        LocalDate now = LocalDate.now();
        int nowYear = now.getYear();
        if(nowYear < year) return;
        else{
            this.year = year;
        }
    }
    //브랜드명 가져오기
    public String getBrand() {
        return this.brand;
    }
    //모델명 가져오기
    public String getModel() {
        return this.model;
    }
    //연식 리턴
    public String getYear() {
        return  Integer.toString(this.year);
    }
}
