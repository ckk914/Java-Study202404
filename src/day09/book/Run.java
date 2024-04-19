package day09.book;

import day03.member.Gender;
import util.SimpleInput;

public class Run {
    public static void main(String[] args) {
        LibraryView view = new LibraryView();
        SimpleInput si = null;
        BookUser bu = new BookUser();
        Book bk = new Book();
        LibraryRepository lr = new LibraryRepository();

        view.start();
    }
}
//        lr.addNewBook(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
//        lr.addNewBook(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
//        lr.addNewBook(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
//        lr.addNewBook(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
//        lr.addNewBook(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
//        lr.addNewBook(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
//

//        while (true) {
//            if (bu.getName() == null || bu.getAge() == 0
//                    || bu.getGender() == null) {
//                if (bu.getName() == null) {
//                    String UserName = si.input("회원이름을 입력하세요\n> ");
//                    if (UserName != null) bu.setName(UserName);
//                    else return;
//                }
//                if (bu.getAge() == 0) {
//                    int age = Integer.parseInt(si.input("나이를 입력하세요\n> "));
//                    if (age != 0) bu.setAge(age);
//                    else return;
//                }
//                if (bu.getGender() == null) {
//                    String gender = si.input("성별을 입력하세요(m/f): >");
//                    if (gender != null) {
//                        if (gender.equals("m") || gender.equals("MALE")) {
//                            bu.setGender(Gender.MALE);
//                        } else if (gender.equals("f") || gender.equals("FEMALE")) {
//                            bu.setGender(Gender.FEMALE);
//                        } else {
//                            return;
//                        }
//                    }
//                }
//            } else {
//                while (true) {
//                    String menuNum = lv.showProgramMenu();
//                    switch (menuNum) {
//                        case "1":
//                            //마이페이지
//                            bu.GetUserInfo();
//                        case "2":
//                            //2. 도서 전체 조회
//
//                            break;
//                        case "3":
//                            //도서 제목으로 검색
//                            break;
//                        case "4":
//                            //도서 대여하기
//                            break;
//                        case "5":
//                            //도서 저자이름으로 검색
//                            break;
//                        case "6":
//                            break;
//                        case "9":
//                            //종료하기
//                    } // end switch
//
////            si.stopInput();
//                }
//            }
//
//        }
//
//
//    }

