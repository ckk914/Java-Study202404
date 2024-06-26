package day06.member;

import util.SimpleInput;

//역할: 회원 데이터 관리를 위해 입력 출력을 담당함
public class MemberView {

    //객체의 협력
    MemberRepository mr;
    SimpleInput si;

    MemberView() {
        //실체 생성
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }

    //메서드
    // 모든 회원의 정보를 출력하는 기능
    void showMembers() {
        System.out.printf("===현재 회원 목록 (총 %d명)======\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }

    //회원 정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = null;
        while (true) {
            email = si.input("- 이메일 : ");
            if(!mr.isDuplicateEmail(email)) {
                break;
            }
                System.out.println("중복된 이메일입니다.");
        }
        String name = si.input("- 이름 : ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별: ");
        int age = Integer.parseInt(si.input("- 나이: "));

        //입력데이터를 기반으로 한 명의 회원의 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);
        //mr에게 위임한다 = 관심사의 분리
        mr.addNewMember(newMember);
    }

    //사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 프로그램 종료");
        System.out.println("=============================");

        String menuNumber = si.input("- 메뉴 번호: ");
        return menuNumber;
    }

    // 프로그램 종료를 판단하는 입출력
    boolean exitProgram() {
        String exit = si.input("- 프로그램을 종료합니까? [y/n]\n>> ");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다!");
            return true;
        }
        else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }


}
