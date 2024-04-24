package day12.io.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import day12.io.FileExample;

//바이트 기반 출력 스트림 예제 :
// 영상 이미지, 텍스트 등 모든 데이터 출력 가능 (저장 같은 개념 쏘는..)
public class FileOutputExample {




    public static void main(String[] args) {
        String message = "멍멍이는 멍멍멍 왈왈왈!\n야옹이는 냥냥냥";
        //⭐️try with resource
        // : close가 필요한 하드웨어 접근 코드에 의해
        //   메모리 자원 반납처리를 자동화 해주는 문법
        //   ㄴ try(FileOutputStream fos =new FileOutputStream(FileExample.ROOT_PATH + "/hello/Pet.txt"); ) {
        //   ㄴ try 문 안에다가 선언하기!! ⭐️

        //FileOutputStream fos = null;

            try(FileOutputStream fos =new FileOutputStream(FileExample.ROOT_PATH + "/hello/Pet.txt"); ) {
//                fos = new FileOutputStream(FileExample.ROOT_PATH + "/hello/Pet.txt");
                //write(byte b): 출력 스트림으로 1바이트를 내보냄.
                fos.write(message.getBytes());
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
                  // try with resource 로 선언했으면 close 안해도 됨 ⭐️
//                try {
//                   if(fos != null) fos.close();
//                } catch (IOException e) {
//                    //에러 로그만 찍음
//                    e.printStackTrace();
//                }
//            }

    }

}


