package day12.stream.quiz1;

import day12.stream.Dish;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아
        // 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> s1 = transactions.stream()
                .filter(t -> t.getYear() == 2021)    //알파벳은 다른거 써도 됨.
                .sorted(Comparator.comparing(Transaction::getValue))
                        .collect(Collectors.toList());

//        System.out.println("s1 = " + s1);
        s1.forEach(System.out::println);

        System.out.println("===============");
        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>

        List<String> c1 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
//        .collect(Collectors.toSet()) //set으로 해도 중복 날라감

//        List<String> cc1 = c1.stream()
//                .map(c -> c.getCity()).distinct()
//                .collect(Collectors.toList());

        System.out.println("c1 = " + c1);
//        System.out.println("cc1 = " + cc1);
        System.out.println("===============");
        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아
        // 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        List<Trader> c3 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getTrader())
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                        .collect(Collectors.toList());
        c3.forEach(System.out::println);
//        System.out.println("c3 = " + c3);
        System.out.println("===============");
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로  오름차정렬하여 반환
        // List<String>

        //중복 제거 ->필터 제거 -> 마지막에 정렬-> 정렬이 은근 오래걸린다~!⭐️
//        List<String> c4 = transactions.stream()
//                .map(transaction -> transaction.getTrader())
//                .sorted(Comparator.comparing(Trader::getName)).distinct()
//                .map(Trader::getName)
//                .collect(Collectors.toList());

        List<String> c4 = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
                .sorted()       //그냥 두면 오름차순
//                .sorted(Comparator.reverseOrder())  //정렬 기준 없을때 내림차순
                .collect(Collectors.toList());
        c4.forEach(System.out::println);
//        System.out.println("c4 = " + c4);

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean b1 = transactions.stream()
//                .map(t -> t.getTrader())
                // ⭐️        equalsIgnoreCase : 대소문자 무시하고 비교하는 방법
                .anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));

        System.out.println("b1 = " + b1);
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int sum1 = transactions.stream()
                .mapToInt(t -> t.getValue())
                .sum();                         //mapToInt를 쓰면 Sum을 쓸 수 있따⭐️

        System.out.println("sum1 = " + sum1);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int max1 = transactions.stream()
                .mapToInt(t -> t.getValue())
                .max()
                .getAsInt();
//                .collect(Collectors.toList());

//        int max = Collections.max(c5);
        System.out.println("max = " + max1);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
//        int min1 = transactions.stream()
//                .mapToInt(t -> t.getValue())
//                .min()
//                .getAsInt();
//        System.out.println("min1 = " + min1);
//        Transaction minTrs = transactions.get(0);
//        for(Transaction trs: transactions){
//            if(trs.getValue()< minTrs.getValue()){
//                minTrs =
//            }
        /**
         *  자바의 단점 : 널 체크 문법이 없음
         */

        Optional<Transaction> min = Optional.of(transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .orElse(null));  //만약 결과가 null일 경우 어케 하겠다

//        min.ifPresent(Transaction::getValue);

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.
        List<Transaction> c6 = transactions.stream()
                .filter(t -> t.getValue() >= 500)
                .collect(Collectors.toList());
        c6.forEach(System.out::println);
//        System.out.println("c6 = " + c6);
        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        //최소 거래액 찾기
        int minvalue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();

        OptionalDouble average1 = transactions.stream()
                .filter(t -> t.getValue() > minvalue)
                .mapToInt(t -> t.getValue())
                .average();

        System.out.println("average1 = " + average1);
        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을
        // 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */
        List<Transaction> c7 = transactions.stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .collect(Collectors.toList());
        System.out.println("c7 = " + c7);
        // 연도별로 그룹화하고 출력
        Map<Integer,List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .collect(Collectors.toList());

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .collect(Collectors.toList());

        groupByYearMap.put(2021, trs2021); //key, value
        groupByYearMap.put(2022, trs2022);

        for(Integer year: groupByYearMap.keySet()){  //[2021,2022]
            System.out.println("year = " + year);
            for(Transaction transaction: groupByYearMap.get(year)){
                System.out.println(transaction);
            }
        }

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridfe"))
                .collect(Collectors.groupingBy(trs -> trs.getYear()));

        cambridgeTrsMap.forEach((key,value)->{
            System.out.println("year = "+ key);
            value.forEach(System.out::println);
        });



//        Map<Integer, List<Transaction>> transactionsByYear = c7.stream()
//                .collect(Collectors.groupingBy(Transaction::getYear));
//
//        transactionsByYear.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey()) // 연도별로 정렬
//                .forEach(entry -> {
//                    System.out.println("Year: " + entry.getKey());
//                    entry.getValue().stream()
//                            .sorted(Comparator.comparingInt(Transaction::getValue)) // 거래액으로 정렬
//                            .forEach(transaction -> {
//                                Trader trader = transaction.getTrader();
//                                System.out.println("{Trader: " + trader.getName() + " in " + trader.getCity() +
//                                        ", year: " + transaction.getYear() + ", value: " + transaction.getValue() + "}");
//                            });
//                    System.out.println();
//                });
//        List<Transaction> sortedTransactions = c7.stream()
//                .sorted(Comparator.comparingInt(Transaction::getYear))
//                .collect(Collectors.toList());
//
//        sortedTransactions.forEach(System.out::println);
//        System.out.println("sortedTransactions = " + sortedTransactions);

        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        int gap = max1-minvalue;
        System.out.println("gap = " + gap);

    }
}
