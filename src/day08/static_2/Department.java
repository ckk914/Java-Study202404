package day08.static_2;

public class Department {
//    **클래스 `Department` 생성**

//            - 메소드:
//            - 생성자: `departmentName`과 학과별 초기 학생 수를 매개변수로 받아 초기화하며, `totalStudents`를 적절히 업데이트합니다.
//        - `addStudent(int number)`: 주어진 수만큼 학과 학생 수를 증가시키고 `totalStudents`도 적절히 업데이트합니다.
//        - `getStudentCount()`: 현재 학과의 학생 수를 반환합니다.
//        - `getTotalStudents()`: 전체 학생 수를 반환하는 static 메소드입니다.

    //            - 속성:
//            - `departmentName` (학과 이름, 문자열, 인스턴스 변수)
//            - `studentCount` (학과별 학생 수, 정수형, 인스턴스 변수)
//            - `totalStudents` (전체 학생 수, 정수형, static 변수)
    private String departmentName;
    private int studentCount;
    static int totalStudents;  //총원

    //생성자
    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents+=studentCount;
    }



    //추가 인원
    public void addStudent(int addNum) {
        this.studentCount+=addNum;
        totalStudents+=addNum;
    }

    //학생 수 display
    public int getStudentCount() {
        return this.studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
