package day12.stream.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("홍철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );
        
        //나이 순으로 오름차 정렬(나이 적은순으로 앞에)
        //Comparator -> 인터페이스임
        //낮은 것 부터 정렬한다~!
        // 1번빼기 2번 뺴기 = 오름차
        //반대로 하면 내림차순 됨..ㄱ
        // 2번빼기 1번 하면 내림차
        studentList.sort((o1, o2) ->o1.getAge() - o2.getAge());
        System.out.println("studentList = " + studentList);
        //성적 순으로 내림차 정렬(성적 우수 순)
        //오름차순임
        studentList.sort(comparing(s->s.getScore()));
        //내림차순

//        studentList.sort(comparing(s-> s.getScore()).reversed());
        // 성적 순으로 내림차 정렬 (성적 높은 순)
        //s 에 이번엔 형을 명시해야함~! Student s 로 ⭐️
        studentList.sort(Comparator.comparing((Student s) -> s.getScore()).reversed());

        System.out.
                println("studentList = " + studentList);
        //==========


        studentList.sort(Comparator.comparing(s->s.getName()));
        System.out.println("studentList = " + studentList);
    }
}
