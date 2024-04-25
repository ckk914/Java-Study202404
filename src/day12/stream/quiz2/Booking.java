package day12.stream.quiz2;

//예약 정보
public class Booking {
private Traveler traveler; //여행자
    private Destination destination;  //여행지
    private int year; //여행년도
    private int price;

    public Booking(Traveler traveler, Destination destination, int year, int price) {
        this.traveler = traveler;
        this.destination = destination;
        this.year = year;
        this.price = price;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public Destination getDestination() {
        return destination;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "traveler=" + traveler +
                ", destination=" + destination +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
