package day07.encap;

public class Product {
    //            - 제품의 이름(name), 가격(price), 재고 수량(stock)을 관리하는 `Product` 클래스를 만드세요.
    private String name;    //제품 이름
    private int price;      // 가격
    private int stock;      // 재고 수량

    //이름 세팅
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    //가격 설정
    public void setPrice(int price) {
        this.price = price;
    }
    //재고 설정
    public void setStock(int stock) {
        this.stock = stock;
    }
    //이름 가져오기
    public String getName() {
        return this.name;
    }
    //가격 가져오기
    public int getPrice() {
        return this.price;
    }
    //재고 정보 가져오기
    public int getStock() {
        return this.stock;
    }
    //재고 감소 시키기!
    //            - 재고를 감소시키는 메소드는 재고가 요청 수량보다 많을 때만 작동하도록 하세요.
    public void reduceStock(int i) {

        //재고가 더 많을 때 진행
        if(i<stock){
            stock-=i;

        }
    }


//            - 모든 필드를 private로 선언하고, 제품 정보를 읽거나 수정할 수 있는 public 메소드를 구현하세요.



}
