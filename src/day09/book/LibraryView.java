package day09.book;

import day03.member.Gender;
import util.SimpleInput;

//역할 : 도서관리 프로그램에서 입출력을 담당하는 객체
public class LibraryView {

    private static LibraryRepository repository;
    private static BookUser bu;
    SimpleInput si = null;

    static {
        repository = new LibraryRepository();
        bu = new BookUser();
    }

    //회원 정보를 입력받는 기능
    public void makeNewBookUser() {
        System.out.println("\n#회원 정보를 입력해주세요.");
        String name = si.input("# 이름 : ");
        int age = Integer.parseInt(si.input("#나이 : "));
        Gender gender = inputGender();

        //입력된 데이터를 저장시켜야함.
        repository.saveBookUser(new BookUser(name, age, gender, 0));
    }

    //성별을 정확히 입력받을 때 까지 무한히 입력받고
    //정확히 입력하면 해당 성별 문자를 리턴
    private Gender inputGender() {
        while (true) {
            String gender = si.input("# 성별(M/f): ").toUpperCase();
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("\n# 성별을 잘못 입력하였습니다.");
        }
    }

    // 메뉴를 출력하는 기능
    public void showMainScreen() {
        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        makeNewBookUser();

        while (true) {
            showMainScreen();
            String menuNum = si.input("- 메뉴 번호 : ");

            switch (menuNum) {
                case "1":
                    repository.GetUserInfo();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    bookSearch();
                    break;
                case "4":
//                    sendBook();
                    rentBook();
                    break;
                case "9":

                    System.out.println("# 프로그램을 종료합니다!!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }

    private void rentBook() {
        System.out.println("\n=====전체 도서 목록 =====");
        Book[] infomationList = repository.getAllBooksInfo();
        int num = 1;
        for(Book book:infomationList){
            System.out.println("# "+num+". "+book.info());
            num++;
        }
        int bNum = Integer.parseInt(si.input("대여할 책 번호를 고르세요: "));
        //저장소에 대여가능한지 여부 검증 ⭐️
        RentStatus status = repository.rentBook(bNum);

        if(status == RentStatus.RENT_SUCCESS_WITH_COUPON){
            System.out.println("쿠폰과 함께 대여 성공");
        } else if (status == RentStatus.RENT_SUCCESS) {
            System.out.println("대여 성공");
        }
        else if(status == RentStatus.RENT_FAIL){
            System.out.println("대여 실패");
        }
    }

    //검색 기능
    //책 제목으로 검색하여 검색어가 포함된 책 정보 출력하기
    private void bookSearch() {
        System.out.println("\n=====전체 도서 목록 =====");
        Book[] infomationList = repository.getAllBooksInfo();

        String SearchStr = si.input("검색할 책 제목을 입력하세요: ");

        Book[] searchBook = repository.searchBookList(SearchStr);

        if(searchBook.length >0){
//            for()
        }else{
            System.out.println("검색 결과가 없습니다.");
        }

//        for(Book book:infomationList){
//            if(book.getTitle().contains(SearchStr)) {
//                System.out.println(book.info());
//            }
//        }

    }

    //전체 도서 정보를 출력
    private void displayAllBooks() {
        System.out.println("\n=====전체 도서 목록 =====");
        Book[] infomationList = repository.getAllBooksInfo();

        for(Book book:infomationList){
            System.out.println(book.info());
        }
    }

    //대여 ㄱㄱ
    private void sendBook() {
        System.out.println("\n=====전체 도서 목록 =====");
        Book[] infomationList = repository.getAllBooksInfo();
        int num = 1;
        for(Book book:infomationList){
            System.out.println("# "+num+". "+book.info());
            num++;
        }
        int bNum = Integer.parseInt(si.input("대여할 책 번호를 고르세요: "));
        String check="";
        for (int i = bNum-1; i <bNum ; i++) {
            check=infomationList[i].getClass().toString();
        }
        if(check.contains("CartoonBook")){
            int Age = repository.GetBookAge(bNum-1);
            System.out.println(Age);
//            System.out.println(infomationList[bNum-1]);
//            System.out.println(bu.getAge());
            //            bu.getAge()
        }
//        accessAge
    }
}



    //
//# 2. 도서 전체 조회
//# # 2. 도서 전체 조회
//# 4. 도서 대여하기 # 5. 도서 저자이름으로 검색
//# 9. 프로그램 종료하기
//- 메뉴 번호 :
//String showProgramMenu() {
//    System.out.println("\n##### 회원 관리 시스템 #####");
//    System.out.println("* # 1. 마이페이지");
//    System.out.println("* # 2. 도서 전체 조회");
//    System.out.println("* # 3. 도서 제목으로 검색");
//    System.out.println("* # 4. 도서 대여하기");
//    System.out.println("* # 5. 도서 저자이름으로 검색");
//    System.out.println("* # 7. 프로그램 종료");
//    System.out.println("=============================");
//
//    String menuNumber = si.input("- 메뉴 번호: ");
//    return menuNumber;
//}
//public void start(){
//        makeNewBookUser();
//
//        while (true){
//            showProgramMenu();
//        }
//}
//}
