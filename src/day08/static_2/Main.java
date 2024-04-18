package day08.static_2;

public class Main {
    public static void main(String[] args) {
        Department compSci = new Department("컴퓨터 과학", 200);
        Department biology = new Department("생물학", 150);
        Department chemistry = new Department("화학", 120);

        System.out.println(Department.totalStudents);
        compSci.addStudent(30);
        biology.addStudent(20);
//
        System.out.println("컴퓨터 과학과 학생 수: " + compSci.getStudentCount());
        System.out.println("생물학과 학생 수: " + biology.getStudentCount());
        System.out.println("화학과 학생 수: " + chemistry.getStudentCount());
        System.out.println("전체 학생 수: " + Department.getTotalStudents());
    }
}
