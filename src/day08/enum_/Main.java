package day08.enum_;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.orderPizza();
        pizza.readyPizza();

        System.out.println("Status = " + pizza.getStatus().getDescription());
        System.out.println("소요시간 = "+pizza.getStatus().getTimeToSetup());
    }

}
