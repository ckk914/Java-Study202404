package day09.poly.computer2;

public class Memory extends ComputerPart {
    public Memory(String partName, int partPrice) {
        super(partName,partPrice);
    }
    @Override
    public void describePart() {
        System.out.println("Memory: " + partName + ", Price: " + partPrice);
    }
}
