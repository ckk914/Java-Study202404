package day11.api.lang;

public class StringBuilderTest {
    private static void makeString() {

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 200000; i++) {
            s += "A";  //쌩으로 누적 시킴
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요 시간: " + (end - start) + "밀리초");
    }

    private static void makeStringBuilder() {

        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 200000; i++) {
            s.append("A");  //A누적 코드            //이게 더 빠르긴 함.
        }
        long end = System.currentTimeMillis();

        System.out.println("빌더 총 소요 시간: " + (end - start) + "밀리초");
    }

    public static void main(String[] args) {

        makeStringBuilder();
        makeString();



    }
}
