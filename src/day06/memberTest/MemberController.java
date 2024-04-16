package day06.memberTest;

import util.SimpleInput;

public class MemberController {
    //협력할 곳
    MemberView mv;
    SimpleInput si;
    //생성자
    MemberController() {
        //협력할 것 선언
        this.mv = new MemberView();
        this.si = new SimpleInput();
    }

    //메뉴 입력 분기에 따라 할 일을 나눠주는 기능
    void run() {
        while (true) {
            String menuNum = mv.showProgramMenu();
            switch (menuNum) {
                case "1":
                    //입력
                    mv.inputNewMember();
                    break;
                case "2":
                    mv.MemberSearch();
                    break;
                case "3":
                    //조회
                    mv.showMembers();
                    break;
                case "4":
                    //수정
                    mv.MemberEdit();
                    break;
                case "5":
                    //삭제
//                    mv.removeMember();
                    mv.deleteMember();
                    break;
                case "6":
                    //복구
                    mv.restoreMember();
                    break;
                case "7":
                    boolean flag = mv.exitProgram();
                    if (flag) return;

            }
            si.stopInput();
        }
    }
}
