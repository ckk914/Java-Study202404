package day07.encap;

public class Student {
    //            - 학생의 이름(name), 학번(studentId), 학과(department) 정보를 관리하는 `Student` 클래스를 만드세요.
//            - 모든 정보 필드는 private으로 선언하고,
    private String name;            // 이름
    private String studentId;       // 학번
    private String department;      // 학과

    //이름 설정
    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    //학번 설정
    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty()) return;
        this.studentId = studentId;
    }

    //학부 설정
    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) return;
        this.department = department;
    }


    //이름 반환
    public String getName() {
        return this.name;
    }

    //학번 반환
    public String getStudentId() {
        return this.studentId;
    }

    //학부 반환
    public String getDepartment() {
        return this.department;
    }


//            각 필드의 getter와 setter 메소드를 public으로 만드세요.
//            - setter 메소드에서는 유효하지 않은 입력(예: null 값 또는 빈 문자열)에 대한 검증 로직을 포함하세요.
}
