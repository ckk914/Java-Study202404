package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(students));

        // 탐색 알고리즘
        System.out.println("- 삭제할 학생의 별명을 입력하세요");
        System.out.print("> ");
        String target = sc.nextLine();

        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (target.equals(students[i]))  {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // 삭제 알고리즘
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }

            String[] temp = new String[students.length - 1];

            for (int i = 0; i < students.length - 1; i++) {
                temp[i] = students[i];
            }

            students = temp;
            temp = null;

            System.out.println("* 삭제 후 정보: " + Arrays.toString(students));
        } else {
            System.out.printf("해당 별명 (%s)은(는) 존재하지 않습니다.\n", target);
        }

//        String[] Students = new String[]{"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
//
//        System.out.println("우리반 학생들의 별명: "+ Arrays.toString(Students));
//        //탐색 알고리즘
//        System.out.println("삭제할 학생의 별명을 입력하세요!");
//        Scanner Sc = new Scanner(System.in);
//        String delName = Sc.nextLine();
//        //삭제 알고리즘
//        System.out.printf("%s를 삭제합니다.\n",delName);
//        int targetNum = -1;
//        for(String str :Students){
//            if(str.equals(delName)) break;
//                targetNum++;
//        }
////        System.out.println(targetNum);
//
//        for(int j = targetNum;j<Students.length-1;j++ ){
//        Students[j] = Students[j+1];
//        }
////        System.out.println(Arrays.toString(Students));
//        String[] temp = new String[Students.length-1];
//        for(int k=0;k<temp.length;k++){
//            temp[k]=Students[k];
//        }
//        Students = temp;
//        temp = null;
//        System.out.println(Arrays.toString(Students));
//        System.out.println("%s를 삭제합니다",delName);
    }
}
