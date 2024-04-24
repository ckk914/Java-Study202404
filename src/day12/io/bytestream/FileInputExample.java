package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

//바이트 기반 출력 스트림 예제 :
// 영상 이미지, 텍스트 등 모든 데이터 출력 가능
public class FileInputExample {


    //읽어오기!!
    

    public static void main(String[] args) {
        //⭐️try with resource 
        //FileOutputStream fos = null;

            try(FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/hello/Pet.txt"); ) {
//                fis = new FileOutputStream(FileExample.ROOT_PATH + "/hello/Pet.txt");
                //write(byte b): 출력 스트림으로 1바이트를 내보냄.
                //read : read a byte(1byte)
//                int data = fis.read();
                int data = 0;
                //⭐️읽은 후 -1 바로 확인하면
                // 끝에 -1 로 찍은 이상한문자 안찍히게 할 수 있음!! ⭐️
                while ((data = fis.read())!=-1) {
//                data= fis.read();
                //아스키를 문자로 출력 ⭐️
                    System.out.write(data);
                }
                //이상하게 한줄이 출력이 덜됐다.. 해결방법⭐️ ▽
                //출력 버퍼 비우기
                //버퍼가 차야지 출력을 내보내는데, 다 안찬 상태인데,
                //플러쉬 해라!~!
                System.out.flush();

//                System.out.println("(char)data = " + (char)data);
//                data = fis.read();
//                System.out.println("(char)data = " + (char)data);
            } catch (FileNotFoundException e) {
                System.out.println("해당 경로를 찾을 수 없습니다.");
            } catch (IOException e) {
                System.out.println("출력 시스템에 장애가 발생했습니다.");
            }

//            finally {
//                //예외가 나도 실행
//                //안나도 실행
//                //마지막에 실행되는 코드
//                System.out.println("이 코드는 무조건 실행");
//
//                //파일 입출력과 같은 코드는 하드웨어에 직접 접근하는 코드이므로
//                //보통 사용 후 메모리 정리를 해줘야,
//                //다음 실행에 문제가 생길 여지가 줄어듬
//                //필수 코드! ⭐️
//                //다 썼으면 해제해랏 ⭐️
//                try {
//                   if(fos != null) fos.close();
//                } catch (IOException e) {
//                    //에러 로그만 찍음
//                    e.printStackTrace();
//                }
//            }

    }

}


