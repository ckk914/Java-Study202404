package day02;

public class ArraySearch {
    public static void main(String[] args) {
        String[] foods = {"족발", "파스타", "치킨", "삼겹살", "갈매기살"};
        String target = "치킨";

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index+ " "+foods[index]);
    }
}
