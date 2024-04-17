package day07.inherit;

public class Smartphone extends ElectronicProduct{

    public int storageCapacity;  //저장 공간

    public Smartphone(String productName,double price,String manufacturer,int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }
    @Override
    public  void displayInfo(){
        super.displayInfo();
        System.out.println("storageCapacity = " + storageCapacity+"GB");
    }
}
