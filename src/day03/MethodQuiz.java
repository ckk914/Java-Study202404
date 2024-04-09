package day03;

//import static jdk.nashorn.internal.objects.NativeArray.push;

import java.util.Arrays;

public class MethodQuiz {
    static String[] Foods = {"떡볶이","치킨","파스타"};
    //    출력 함수
    static void printFoods(){
        System.out.println(Arrays.toString(Foods));

    }
    //push 함수
    private static void push(String addStr){
        String[] temp = new String[Foods.length+1];
        for (int i = 0; i <Foods.length ; i++) {
            temp[i] = Foods[i];
        }
        temp[temp.length-1] = addStr;
        Foods =temp;
        temp = null;
        System.out.println(Arrays.toString(Foods));
    }
    //indexOf 함수
    private static int indexOf(String SearchStr){
        int index = -1;
        for (int i = 0; i < Foods.length; i++) {
            if(SearchStr.equals(Foods[i])){index = i;}
        }
        return index;
    }
    //remove 함수
    private static void remove(String delStr){
        int delStrPosition = indexOf(delStr);
        System.out.println("delStrPosition = " + delStrPosition);
        for (int i = delStrPosition; i < Foods.length-1; i++) {
            Foods[i] = Foods[i+1];
        }

        String[] temp = new String[Foods.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=Foods[i];
        }
        Foods = temp;
        temp = null;
        System.out.println(Arrays.toString(Foods));
    }
    //include 함수
    private static boolean include(String CheckStr){
        boolean flag= false;
        int index = -1;
        index = indexOf(CheckStr);
        if(index == -1) flag= false;
        else flag= true;

        return flag;
    }
//    삽입 함수
    private static void insert(int num, String addStr) {
//        num =3 ;
        String [] temp =new String[Foods.length+1];
        if(0<num){
            for (int i = 0; i <num ; i++) {
                temp[i]= Foods[i];
            }
            temp[num]= addStr;
            for (int i = num; i <Foods.length ; i++) {
                temp[i+1] = Foods[i];
            }
            System.out.println(Arrays.toString(temp));
        }
    }
    //수정 함수
    private static void modify(int num,String EditStr){
        if(num< Foods.length) {
            Foods[num] = EditStr;
        }
    }
    //메인
    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();




    }


}
