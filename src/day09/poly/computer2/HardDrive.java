package day09.poly.computer2;

public class HardDrive extends ComputerPart{
    public HardDrive(String partName, int partPrice) {
        super(partName,partPrice);
    }
    @Override
    public void describePart() {
        System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
    }
}
