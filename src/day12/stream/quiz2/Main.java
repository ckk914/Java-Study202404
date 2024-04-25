package day12.stream.quiz2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500)
        );

        // 연습 1: 2022년에 예약된 모든 여행을 찾아 가격 오름차 정렬.
        List<Booking> c1 = bookings.stream()
                .filter(f -> f.getYear() == 2022)
                .collect(Collectors.toList());
        System.out.println("c1 = " + c1);
        // 연습 2: 여행지가 있는 모든 나라 이름을 중복 없이 나열하시오.
        List<String> c2 = bookings.stream()
                .map(t -> t.getDestination().getCountry())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("c2 = " + c2);
        // 연습 3: Paris에 예약된 모든 여행자를 찾아 이름순으로 오름차 정렬.
        List<Booking> paris1 = bookings.stream()
                .filter(t -> t.getDestination().getCity().equals("Paris"))
                .collect(Collectors.toList());

        paris1.forEach(System.out::println);
        System.out.println("=======");
        // 연습 4: 모든 여행자의 이메일을 리스트에 모아서
        // 알파벳순으로 오름차정렬하여 반환.
        Stream<String> emailList = bookings.stream()
                .map(b -> b.getTraveler().getEmail())
                        .sorted();

        emailList.forEach(System.out::println);
        System.out.println("=======5");
        // 연습 5: Italy로의 여행이 한 건이라도 있는지 여부 확인.
        boolean isitaly = bookings.stream()
                .anyMatch(b -> b.getDestination().getCountry().equals("Italy"));

        System.out.println("isitaly = " + isitaly);

        System.out.println("=======6");
        // 연습 6: France로의 모든 여행의 총 가격을 출력.
        int sumFrance = bookings.stream()
                .filter(b -> b.getDestination().getCountry().toString().equals("France"))
                .mapToInt(b -> b.getPrice())
                .sum();
        System.out.println("sumFrance = " + sumFrance);
        System.out.println("=======7");
        // 연습 7: 예약된 모든 여행에서 최고 가격은 얼마인가?
        int priceMax = bookings.stream()
                .mapToInt(b -> b.getPrice())
                .max()
                .getAsInt();



        System.out.println("priceMax = " + priceMax);

        System.out.println("=======8");
        // 연습 8: 가장 저렴한 여행의 정보 탐색.
        int priceMin = bookings.stream()
                .mapToInt(b -> b.getPrice())
                .min()
                .getAsInt();
        System.out.println("priceMin = " + priceMin);
        System.out.println("=======9");
        // 연습 9: 가격이 2000 이상인 모든 여행 예약 정보를 출력.
        List<Booking> c3 = bookings.stream()
                .filter(b -> b.getPrice() >= 2000)
                .collect(Collectors.toList());

        c3.forEach(System.out::println);

        System.out.println("=======10");
        // 연습 10: 모든 예약에서 
        // 가장 낮은 가격보다 
        // 높은 가격을 가진 예약의 평균 가격을 계산하시오.
        double aver1 = bookings.stream()
                .filter(b -> b.getPrice() > priceMin)
                .mapToInt(b -> b.getPrice())
                .average()
                .getAsDouble();
        System.out.println("average1 = " + aver1);
        System.out.println("=======11");
        // 연습 11: 모든 여행자의 여행 예약을 여행지별로
        // 그룹화하여 출력하시오.
        Map<String,List<Booking>> groupByYearMap = new HashMap<>();



        System.out.println("=======12");
        // 연습 12: 모든 예약 중 최고 가격과
        // 최저 가격의 차이를 계산하시오.
        System.out.println(priceMax-priceMin);
        System.out.println("=======");
    }
    
}
