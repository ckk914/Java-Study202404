package day11.api.lang.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        //자바8 이전
        Date date = new Date();
        System.out.println("date.getYear() = " + date.getYear()); //124 가 찍힘;;

        Calendar Calendar = java.util.Calendar.getInstance();

        //자바 8 이후
        LocalDateTime nowDate = LocalDateTime.now();
        //날짜 찍기
        System.out.println("nowDate = " + nowDate);

        System.out.println(nowDate.getYear());
        System.out.println(nowDate.getDayOfMonth());

        //현재 시간
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);
        //날짜 시간 합친거
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);
        
        //특정 날짜 정보 생성하기
        LocalDate targetDate = LocalDate.of(2022,4,15);
        System.out.println("targetDate = " + targetDate);

        //날짜 연산
        //3일 뒤 반납
        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);
        
       LocalDate TargetDateTime =  returnDate.plusYears(2)
                .plusMonths(3)
                .plusDays(5);
        System.out.println("TargetDateTime = " + TargetDateTime);
        
        //사이 날짜 구하기
        LocalDate hireDate = LocalDate.of(2018,3,6);
        LocalDate retireDate = LocalDate.of(2022,12,27);

        long between = ChronoUnit.DAYS.between(hireDate,retireDate);
        System.out.println("between = " + between);

        //날짜 포맷 바꾸기
        System.out.println("dateTime = " + dateTime);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");


        String dateString = dateTime.format(pattern);
        System.out.println("dateString = " + dateString);


    }
}
