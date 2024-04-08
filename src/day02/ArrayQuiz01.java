package day02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
//        배열 push 문제 테스트
        System.out.println("#먹고 싶은 음식을 입력하세요~!");
        System.out.println("#그만 입력하고 싶으면 <그만>이라고 입력하세요.");
//        ArrayList<String> list = new ArrayList<>();
        

        Scanner sc = new Scanner(System.in);
        String[] FoodArray= new String[0];
        String[] temp = new String[0];
        int i=0;
        while(true)
        {
            String newFood = sc.nextLine();
            
            if(newFood.equals("그만")) break;

//            list.add(newFood);
        }

        System.out.println("되니? = " + Arrays.toString(temp));
//        int a = 0;
//        for(String n:FoodArray){
//            if(n==null)break;;
//                a++;
//        }
//        System.out.println("a = " + a);
//        String[] temp = new String[a];
//        for (int j = 0; j < a; j++) {
//            temp[j]=FoodArray[j];
//        }
//        FoodArray =temp;
//        temp = null;

        System.out.println("newFood = " + Arrays.toString(FoodArray));
//        System.out.println("Arrays.toString(list) = " +list);
        








    }
}
