package day11.api.lang;

import java.util.Scanner;
import java.util.Objects;
  /*
         const redPen = {
            serial: 100,
            color: 'red',
            price: 500,
            company: {
                companyName: 'monami',
                address: 'seoul'
            }
         }
     */



class Pen {
    long serial;            //일련번호
    String color;           //색상
    int price;              //가격
    Company company;        //회사

    public Pen(long serial, String color, int price, Company company) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
    //펜의 시리얼 넘버 같으면 같은 펜 되게 하기~!
    // equals를 오버라이딩할 때는 반드시 hashcode도 같이 오버라이딩하여
    // 두 객체가 같을 경우 주소값도 같게 만든다.
    //ctrl +n => equals 및 hashcode 생성
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color, price, company);
    }

//    public boolean equals(Object o){
//        if(o instanceof Pen){
//            Pen target = (Pen)o;
//            return this.serial == target.serial;
//        }
//    }
}
//java.lang 에 소속된 것들은 import 생략 가능!⭐️
class Company{
    String companyName; //회사 이름
    String address;      //회사 주소

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



}
    //오버라이딩됨
//    public String toString(){
//        return "하하호호";
//    }
//}return


public class ObjectSample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Company company = new Company("모나미", "서울");
        System.out.println("company = " + company.toString());

        Pen yellowPen = new Pen(100l,"노랑",1000, new Company("모나미", "서울"));
        System.out.println("yellowPen = " + yellowPen);

        System.out.println("yellowPen = " + yellowPen.company);
        //이거 지우면 널뜸
        yellowPen.company= company;
        //없어서 널 뜸!! ⭐️
        String cName = yellowPen.company.companyName;
        System.out.println("cName = " + cName);
        System.out.println("yellowPen = " + yellowPen);

        Pen bluePen = new Pen(200l, "파랑", 1200, new Company("제트스트림", "도쿄"));
        System.out.println("=====");
        System.out.println(yellowPen == bluePen);
        System.out.println(bluePen.hashCode());
        System.out.println(Integer.toHexString(bluePen.hashCode()));    //주소
        System.out.println(Integer.toHexString(yellowPen.hashCode())); //주소
        System.out.println("=====");

        System.out.println(yellowPen.equals(bluePen));

        //만약 펜의 시리얼 넘버가 같다면 , 같은 펜으로 취급해보자~!
        Pen redPen1 = new Pen(150l, "빨강", 1000, company);
        Pen redPen2 = new Pen(150l, "빨강", 1500, company);

        System.out.println(redPen1 == redPen2);
        System.out.println(redPen1.equals(redPen2));

        System.out.println("redPen1 = " + redPen1.hashCode());
        System.out.println("redPen1 = " + redPen2.hashCode());

        //소멸자는 자바 더이상 지원 안함 9버전 까지만

    }


}
