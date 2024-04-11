package day04;

//댄서 여러명을 등록하는 프로그램
public class Dancer {

    //클래스는 객체의 속성과 기능을 정의
//라이브러리 클래스 : 설계도 역할만 함
    //실행은 안함.
    //main이 없음.
    //여기서는 정의만 한다!

    //객체의 속성: 객체를 표현하는 데이터
    //--> 필드 (field)
    String dancerName; //댄서 이름
    //ㄴ 클래스 안에 있는 변수는 변수라고 하면 안되고
    //   필드이다.
    String crewName;
    String genre;
    int danceLevel; //0 초보 1 아마 2 프로

    //객체의 기능 : 객체가 할 수 있는 일, 행위
    //--> 메서드 (method)
    //     ㄴ static을 붙이지 않음!
    //자기소개 기능
    void introduce() {
        System.out.println("이름:" + dancerName);
        System.out.println("팀명:" + crewName);
        System.out.println("장르:" + genre);
        System.out.println("레벨:" + danceLevel);
    }

    void dance() {
        System.out.println(dancerName + "댄서가" + genre + "춤을 춥니다");
    }

    //생성자(constructor)
    //객체가 생성될 때 초기 값을  세팅해주는 함수의 일종
    //생성자는 함수의 일종인데,
    //  반드시 이름이 클래스 이름과 같아야함
    //  대소문자까지 같아야함
    // 생성자는 리턴값이 없음
    //  따라서 void가 생략됨
    Dancer() {
        dancerName = "춤꾼";
        crewName = "팝핀크루";
        genre = "케이팝";
        danceLevel = 0;
    }
    //생성자는 여러개 만들 수 있음: 생성자 오버로딩
    //규칙 : 파라미터가 달라야함
    Dancer(String dName){
        dancerName = dName;
        crewName = "도시의춤꾼들";
        genre = "어반";
        danceLevel=1;
    }
    Dancer(String dName,String cName){
        dancerName = dName;
        crewName = cName;
        genre = "케이팝";
        danceLevel=2;
    }
    Dancer(String dName,String cName,String genreName){
        dancerName = dName;
        crewName = cName;
        genre = genreName;
        danceLevel=3;
    }
    Dancer(String dName,String cName,String genreName, int level){
        dancerName = dName;
        crewName = cName;
        genre = genreName;
        danceLevel=level;
    }

}
