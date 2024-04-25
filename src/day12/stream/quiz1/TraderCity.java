package day12.stream.quiz1;

public class TraderCity {
    private String city; // 거래자 거주 도시

    public TraderCity(Trader t) {
        this.city = t.getCity();
    }


    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +

                "city='" + city + '\'' +
                '}';
    }
}
