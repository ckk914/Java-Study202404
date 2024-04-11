package day03;

//import static jdk.nashorn.internal.objects.NativeArray.push;

import java.util.Arrays;

public class MethodQuiz {
    public static String[] Foods = {"떡볶이","치킨","파스타"};
    //    출력 함수
    static void printFoods(){
        System.out.println(Arrays.toString(Foods));

    }
    //사이즈를 조절해서 새 배열을 만드는 함수
    static String[] makeNewArray(int size){

        return new String[Foods.length+size];
    }
    //기존 데이터를 복사하는 함수
    static String[] copy(int size){
        //기존 사이즈보다 1개 큰 배열 생성
        String[] temp = makeNewArray(size);

        int loopCount = size >=0 ?Foods.length: temp.length;
        for (int i = 0; i <loopCount ; i++) {
            temp[i] = Foods[i];
        }
        return temp;
    }
    //push 함수
    private static void push(String addStr){
        String[] temp = copy(1);
        //새 배열의 끝인덱스에 새 데이터 추가
        temp[temp.length-1] = addStr;
        Foods =temp;
//        temp = null;  //함수 끝나면 자동으로 지워짐.
        System.out.println(Arrays.toString(Foods));
    }
    //indexOf 함수 : 특정 데이터의 인덱스를 반환
    private static int indexOf(String SearchStr){
        int index = -1;
        for (int i = 0; i < Foods.length; i++) {
            if(SearchStr.equals(Foods[i])){return i;/*index = i; break;*/}
        }
        return -1;
    }
    // Foods배열에서 맨 끝데이터를 삭제하는 함수
    static void pop() {
        Foods = copy(-1);
    }

    //remove 함수 : foods배열에서 맨 끝데이터 삭제하는 함수
    private static void remove(String delStr){
        int delStrPosition = indexOf(delStr);
        if(delStrPosition== -1)return; //찾아서 없으면 리턴

        for (int i = delStrPosition; i < Foods.length-1; i++) {
            Foods[i] = Foods[i+1];
        }

//        pop();
//         ll
        String[] temp = new String[Foods.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=Foods[i];
        }
        Foods = temp;
        System.out.println(Arrays.toString(Foods));
    }
    //include 함수
    private static boolean include(String CheckStr){
return indexOf(CheckStr) != -1;
//        boolean flag= false;
//        int index = -1;
//        index = indexOf(CheckStr);
//        if(index == -1) flag= false;
//        else flag= true;
//        return flag;
    }
//   insert 함수
    private static void insert(int num, String addStr) {
        if(isOutofBounds(num)) return; //조건 안맞으면 리턴
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
    //modify 함수
    private static void modify(int num,String EditStr){
        //조건에 안맞으면 리턴
        if(isOutofBounds(num)) return;
            Foods[num] = EditStr;
    }

    private static boolean isOutofBounds(int num) {
        return num < 0 || num > Foods.length - 1;
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
