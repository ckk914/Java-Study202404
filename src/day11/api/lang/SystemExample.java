package day11.api.lang;

public class SystemExample {
    public static void main(String[] args) {
        //현재 시간 1970년대부터 시작해서 지난 시간 표시
        //프로그램의 실행 시간 체크
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);

        String s ="";
        for (int i = 0; i <200000 ; i++) {
            s+="abc";
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time  "  + time/1000 + "초");
    }
}
