package day04;
//실행용 클래스 : 객체를 생성해서 객체의 기능을 실행시키는 곳
// 실행을 위한 main이 필요함~!
public class DancerMain {
    public static void main(String[] args) {
        //설계도(클래스)를 통해 객체를 찍어냄(생성)
        //형식= 만든 클래스 명
        Dancer kim = new Dancer();
        kim.dancerName= "김뽀또";
        kim.crewName = "치즈단";
        kim.genre = "스트릿";
        kim.danceLevel =1;
        kim.introduce();
        kim.dance();
        //두번째 댄서
        Dancer park = new Dancer();

        park.dancerName = "박격포";
        park.crewName = "전쟁이야";
        park.genre = "코레오";
        park.danceLevel = 2 ;
        park.dance();

        Dancer hong = new Dancer();
        hong.dance();
        //ㄴ 이렇게 언제 만드냐
        //   그래서 쓰는게 `생성자`
        Dancer choi = new Dancer("최폭풍");
        choi.dance();
        choi.introduce();
        Dancer nana = new Dancer("냐냥","시골크루");
        nana.dance();
        nana.introduce();

        Dancer rock = new Dancer("냐냥","시골크루","락킹");
        rock.dance();
        rock.introduce();


    }
}
