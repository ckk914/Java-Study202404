package day07.encap;

//public class Main {
//    public static void main(String[] args) {
//        Car myCar = new Car("그랜져");
//
//        //순서 바꾸면 차가 터짐
//        //이런 기능은 하나로 묶어버리는 게 좋다.= 캡슐화
//
//        //    start/stop만 풀어준다~! public
//        myCar.startStop();
//                //   ㄴ-------ㄱ  안으로 포함됨.
//                //    아래 함수들은 위험하니, private로 묶음(접근 막음)⭐
//                //        myCar.injectGasoline();
//                //        myCar.moveEngineOil();
//                //        myCar.moveCylinder();
//        //필드 접근도 자유로우면 이상한 놈들이 이상한 짓을 할 수 있음...
////        myCar.model= "포르쉐";
////        myCar.start= false;  //위험
//        //속도는 0~200 제한 필요
//
////        myCar.speed = 500;   //위험
//        //공개된 메서드를 통해 값을 세팅한다~!
//        //setter
//        myCar.setSpeed(80);
//        //속도를 가져온다 getter
//        System.out.println("내속도 = " + myCar.getSpeed()+"km/h");
//
//        // 변속모드
//        myCar.setMode('X');
//        System.out.println("현재 변속 모드: "+myCar.getMode());


public class Main {
    public static void main(String[] args) {
        // BankAccount 클래스 테스트
        BankAccount myAccount = new BankAccount("123-456-789", "김철수", 10000);
        System.out.println("현재 잔액: " + myAccount.getBalance());
        myAccount.deposit(50000);
        System.out.println("입금 후 잔액: " + myAccount.getBalance()); // 60000 출력
        myAccount.withdraw(20000);
        System.out.println("출금 후 잔액: " + myAccount.getBalance()); // 40000 출력

        // PasswordManager 클래스 테스트
        PasswordManager pm = new PasswordManager("oldPassword123");
        boolean isChanged = pm.changePassword("oldPassword123", "newPassword123");
        System.out.println("Password changed: " + isChanged); // true

        // Student 클래스 테스트
        Student student = new Student();
        student.setName("박영희");
        student.setStudentId("S001");
        student.setDepartment("Computer Science");
        System.out.println("학생 이름: " + student.getName());
        System.out.println("학번: " + student.getStudentId());
        System.out.println("전공: " + student.getDepartment());

        // Car 클래스 테스트
        Car myCar = new Car();
        myCar.setBrand("현대");
        myCar.setModel("그랜져");
        myCar.setYear(2020);
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());

        // Product 클래스 테스트
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200000);
        product.setStock(30);
        System.out.println("상품명: " + product.getName());
        System.out.println("상품 가격: " + product.getPrice());
        System.out.println("재고 수량: " + product.getStock());
        product.reduceStock(5);
        System.out.println("판매 후 수량: " + product.getStock());
    }
}

