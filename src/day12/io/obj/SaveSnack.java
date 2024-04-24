package day12.io.obj;

import day12.io.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {
        //List.of : 배열 요소 추가!⭐️
        List<Snack> snackList = List.of(
                new Snack("콘칩",1970,1500, Snack.Taste.GOOD)
                , new Snack("사브레",1980,2500, Snack.Taste.BAD)
                , new Snack("오징어집",1985,2000, Snack.Taste.SOSO)
        );
        //파일 확장자 중요치 않음 .아무거나 해도 됨 . 안써도 됨
        try(FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH+"/hello/snack.sav")){
        //객체를 통째로 저장할 수 있는 보조 스트링
            // serialize: 직렬화 - 데이터를 일렬로 늘여뜨려 놓는 것
            //자바 시스템 내부에서 사용되는 Object 또는 Data를
            // 외부의 자바 시스템에서도 사용할 수 있도록
            // byte 형태로 데이터를 변환하는 기술.
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        }catch(Exception e){

        }

    }//end main
} //end class
