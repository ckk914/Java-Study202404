package day10.exception;

public class Main {
    public static void main(String[] args) {
//        ThorwsExample te = new ThorwsExample();
//
////        int n = te.inputNumber();
//
//        try {
//            int n = te.convert("100");
//            System.out.println("te = " + n*20);
//        } catch (NumberFormatException e) {
//            System.out.println("dsdsdsds");
//        }

        LoginUser user = new LoginUser("abv1234","1234");
        try {
            user.loginValidate("abv1234", "12314");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
