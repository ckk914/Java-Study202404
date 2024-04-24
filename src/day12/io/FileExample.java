package day12.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    //파일을 저장할 기본 경로
    public static final String ROOT_PATH ="/Users/kon/konFolder/src/TestZone";

    public static void main(String[] args) {

        //폴더 생성 명령
        //파일 정보 객체 생성
        File directory = new File(ROOT_PATH + "/hello");

        //폴더 생성
        //파일이 존재하지 않는다면 만들어랏
        if(!directory.exists())directory.mkdir();

        //파일 생성하기
        File newfile = new File(ROOT_PATH + "/hello/food.txt");

        if(!newfile.exists()){
            try {
                newfile.createNewFile();
            } catch (IOException e) {
                //throw 지우고 프로그램 터지는걸 막겠다~!
                System.out.println("파일 생성에 실패했습니다.");
            }
        }

    }
}
