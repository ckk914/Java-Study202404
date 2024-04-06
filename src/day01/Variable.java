package day01;

public class Variable {
    public static void main(String[] args) {
        int score = 78;             // 정수
        String userName = "조경곤"; //문자열

        int userN32Ame123;
        int phoneNumber;

        //변수의 스코프  - 블록 레벨 스코프
        // 자바의 변수는 생성된 블록이 종료되면 메모리에서 사라짐
        int i = 100;
        int n4 = 40;
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }// end for

        int n1= 10;
        if(true){
            System.out.println(n1);
            int n2 = 20;
            while (true){
                System.out.println(n2);
                int n3 = 30;
                break;
            }
//            System.out.println(n3);  //사용 불가!
        }
//        System.out.println(j);  //  "출력 불가능"
    } //end main
} //end class
