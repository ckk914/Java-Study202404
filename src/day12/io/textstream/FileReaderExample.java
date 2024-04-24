package day12.io.textstream;

import day12.io.FileExample;
import util.SimpleInput;
import day06try2.Member;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림
//                    2바이트 이상 데이터를 처리 가능
// 바이트 기반 스트림 조상: Outputstream, InputStream
// 텍스트 기반 스트림 조상 : Writer, Reader
public class FileReaderExample {
    public static void main(String[] args) {
        String targetPath = FileExample.ROOT_PATH+ "/hello/member.txt";

        try(FileReader fr = new FileReader(targetPath)){
            //읽는 방법 = 2
            //보조스트링 활용
            //텍스트를 라인 단위로 읽어들이는 보조 스트림
            BufferedReader br = new BufferedReader(fr);

            //회원 정보 저장할 리스트 생성
            List<Member> memberList = new ArrayList<>();

            while(true) {
                String s = br.readLine();
                if (s == null) break;

                //읽는 방법 = 1
//            int read = fr.read();
//            System.out.println("(char)read = " + (char)read);
                //파일 생성 명령
                //읽은 것을 콤마로 구분하여 분리하여 배열로 만든다
                String[] split = s.split(",");
//                System.out.println(Arrays.toString(split));

                // 읽어들인 회원정보로 회원 객체 생성
                Member member = new Member(
                        split[0],                     //email
                        split[2],                    //password
                        split[1],                    //memberName
                        split[3],                   //gender
                        Integer.parseInt(split[4])  //age
                );
                memberList.add(member);
            }

            System.out.println(memberList);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
