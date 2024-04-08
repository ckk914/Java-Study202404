package day02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //입력 준비

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("- 상품의 가격:");
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("- 상품의 수량:");
        int count = Integer.parseInt(scan.nextLine());
        int total = count*price;
        System.out.println("상품 재고 총액 = " + total);
        System.out.printf("상품 재고 총액: %d원\n",total);
        //New Sc 엔터 -> ctrl+alt + v 괄호에 System.in

    }
}
