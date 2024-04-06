package day01;

public class TypeCasting {
    public static void main(String[] args) {
        //===========================================
        byte a = 100; // 1byte
        //원래는 안되는 연산 =>
        // 암묵적 타입 변환 = upcasting (promotion)
        int b = a;    // 4byte
        System.out.println("b = " + b);
        //c: 0 0000000 00000000 00000011 11101000
        int c = 2000; //4byte
        //===========================================
        //명시적 형 변환 downcasting
        //데이터 손실 일으킬 수 있음.
        //소수점 날라가기도 함
        //d = 11101000 => 1 1101000   부호 반전  0 0010111 +1 =>  0011000  => -24 
        byte d = (byte) c;   // 1byte ERROR
        System.out.println("d = " + d);
        
        int k = 50;       // 4byte
        double j = k ;    // 8byte
        System.out.println("j = " + j);
        
        double m = 5.567;
        int n = (int)m;
        System.out.println("n = " + n);
        int v = 100;
        double z = 5.5;
        //타입이 다른 데이터 연산은 작은 쪽을 큰쪽으로 캐스팅한다.!
        // 작은쪽-> 큰쪽 (타입캐스팅)
        double result = v + z;

        float f1 = 3.14f;
        double f2 = 5.5;
        double v1= f1-f2; //double

    }
}
