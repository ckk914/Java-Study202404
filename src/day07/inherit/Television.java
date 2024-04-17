package day07.inherit;

public class Television extends ElectronicProduct {
//     - `screenSize` (화면 크기, 정수형)
    public int screenSize;

    public Television(String productName,double price,String manufacturer,int screenSize) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }
    @Override
    public  void displayInfo(){
        super.displayInfo();
        System.out.println("screenSize = " + screenSize+"inches");
    }


}
