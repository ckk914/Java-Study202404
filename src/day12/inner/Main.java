package day12.inner;

public class Main {

    //내부 클래스(중첩 클래스)         // ㄴ 그냥 클래스하나 더 만들어도 됨!
    //빼기 계산기 필요할때
    //main에서만 도는 걸로 만들어본다~!
    //내부라서 static 붙였음
    public static class SubCalculaotr implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {
        //인터페이스를 참고하여 객체를 만들수 없고
        // 인터페이스를 참고한 또 다른 클래스로 해서 객체를 만들 수 있다.
//        Calculator cal = new Calculator();       //이건 안됨 ⭐️
        Calculator Cal = new AddCalculator();
        int r1 = Cal.operate(10, 20);
        System.out.println("r1 = " + r1);   //30

        Cal = new SubCalculaotr();
        int r2 = Cal.operate(30,12);
        System.out.println("r2 = " + r2);   //18
        //==================================================
        //익명 클래스
        // ㄴ 이름이 없는 클래스를 빠르게 선언하는 법
        // ㄴ 일회용 클래스 만들기~!
        // => 객체를 만들긴 하는데 여기서 잠깐만 쓸 것 같을때 만들어서 씀!
        // 바로 괄호 열어서 만들기
        //==================================================
        //바로 곱셈 하는 계산기 만들어 버리기
        Cal = new Calculator() {
            private int a;

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        int r3 = Cal.operate(10,4);         //40
        System.out.println("r3 = " + r3);
        //==================================================
        //람다  ⭐️
        //사용 전제 조건
        // 반드시 인터페이스 안에 추상메서드가 1개 여야 한다.
        //==================================================
        // 람다를 활용한 익명 클래스 바로 만들어 버리기
        // (n1,n2)를 매개변수로 쓰고 n1/n2를 리턴
        Cal = ( n1,  n2) -> n1/n2;

        int r4 = Cal.operate(40,5);         //8
        System.out.println("r4 = " + r4);

        System.out.println("=======");

        FrenchRestaurant fr = new FrenchRestaurant();
        fr.cook();
        Restaurant japaneseRestant = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("일식 ㄱㄱ");
            }

            //            @Override
//            public void reserve() {
//
//            }
        };


//        Restaurant italian = new Restaurant() {
//            @Override
//            public void cook() {
//                System.out.println("이태리 요리 ㄱㄱ");
//            }
//        };
        //     ㅣㅣ
        //괄호에 마우스 대고 alt enter => 람다로 바꾸기,
        Restaurant italian = () -> System.out.println("이태리 요리ㄱㄱ");

        italian.cook();
    }
}
