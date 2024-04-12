package day05;
//다른 패키지에 있는 클래스를 로딩할떄 이름을 축약해서 쓰기 위해 사용
//import  day05.Juice.Apple;
//import  day05.Juice.Banana;
import day05.Juice.*; // 쥬스 폴더의 모든 것을 IMPORT
import day05.fruit.Apple;

public class PackageMain {
    public static void main(String[] args) {
        //import 안하면 🔻
        day05.fruit.Apple a1 =  new day05.fruit.Apple();
        day05.Juice.Apple A2 =  new day05.Juice.Apple();
        //import 하면 🔻
        Banana nana = new Banana();
        //import 안하면 스캐너의 풀네임 기입🔻
//        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
    }

}
