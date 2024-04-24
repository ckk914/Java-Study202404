package day12.io.textstream;

import day12.io.FileExample;
import util.SimpleInput;

import java.io.FileWriter;

import static util.SimpleInput.*;

//텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림 ⭐️
//                    2바이트 이상 데이터를 처리 가능 ⭐️
// 바이트 기반 스트림 조상: Outputstream, InputStream
// 텍스트 기반 스트림 조상 : Writer, Reader
public class FileWriterExample {
    public static void main(String[] args) {
        String targetPath = FileExample.ROOT_PATH+ "/hello/hobby.txt";

        try(FileWriter fw = new FileWriter(targetPath)){
            String hobby = input("취미를 입력하세요!\n>>");
            String outputMessage = String.format("내 취미는 %s입니다.\n",hobby);
            
            //파일 생성 명령
            fw.write(outputMessage);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
