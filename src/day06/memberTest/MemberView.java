package day06.memberTest;

import day06.memberTest.Member;
import day06.memberTest.MemberRepository;
import util.SimpleInput;

import java.util.Arrays;
import java.util.Scanner;

public class MemberView {
    //객체의 협력
    MemberRepository mr;
    SimpleInput si;
    Scanner sc = new Scanner(System.in);

    MemberView() {
        //실체 생성
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }

    void showMembers() {
        System.out.printf("===현재 회원 목록 (총 %d명)======\n", mr.members.length);
        for (day06.memberTest.Member m : mr.members) {
            System.out.println(m);
        }
    }

    //회원 정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = null;
        while (true) {
            email = si.input("- 이메일 : ");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일입니다.");
        }
        String name = si.input("- 이름 : ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별: ");
        int age = Integer.parseInt(si.input("- 나이: "));

        //입력데이터를 기반으로 한 명의 회원의 객체를 생성
        day06.memberTest.Member newMember = new Member(email, password, name, gender, age);
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
        if (mr.members.length > 0) System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구");
        System.out.println("* 7. 프로그램 종료");
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
        } else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }

    //    멤버 개별 조회
    void MemberSearch() {
        System.out.println("# 조회를 시작합니다.");
        System.out.print("# 이메일 : ");
        String SearchEmail = sc.nextLine();
        for (Member m : mr.members) {
            if (SearchEmail.equals(m.email)) {
                System.out.println("====조회결과====");
                System.out.print("# 이름 : ");
                System.out.println(m.memberName);
                System.out.print("# 비밀번호 : ");
                System.out.println(m.password);
                System.out.print("# 성별 : ");
                System.out.println(m.gender);
                System.out.print("# 나이 : ");
                System.out.println(m.age);
                return;
            } else {
                System.out.println("# 조회된 회원이 없습니다.");
            }
        }
    }  //end MemberSearch

    void MemberEdit() {
        System.out.print("# 수정할 대상의 이메일:");
        String SearchEmail = sc.nextLine();
        for (Member m : mr.members) {
            if (SearchEmail.equals(m.email)) {
                System.out.println("# " + m.memberName + " 님의 비밀번호를 변경합니다.");
                System.out.print("# 새로운 비밀번호: ");
                String newPassword = sc.nextLine();
                m.password = newPassword;
            } else {
                System.out.println("# 조회된 회원이 없습니다.");
            }
        }
    }//end MemberEdit

    void removeMember() {
        System.out.print("# 삭제할 대상의 이메일:");
        String SearchEmail = sc.nextLine();
        int index = -1;

        for (int i = 0; i < mr.members.length; i++) {
            if (SearchEmail.equals(mr.members[i].email)) {
                index = i;
                break; // 일치하는 이메일을 찾으면 반복문을 즉시 종료합니다.
            }
        }

        if (index == -1) {
            System.out.println("해당 이메일을 가진 멤버를 찾을 수 없습니다.");
            return; // 멤버를 찾지 못했으면 메소드를 종료합니다.
        }

// 이메일이 일치하는 멤버를 찾았을 경우의 처리 로직을 여기에 추가합니다.
        for (Member m : mr.members) {
            if (SearchEmail.equals(m.email)) {
                System.out.println("정말로 삭제하겠습니까?[y,n]");
                String yesOrNo = sc.nextLine();

                if (yesOrNo.equals("y")) {
//                    System.out.println(Arrays.toString(mr.members));
                    for (int i = index; i < mr.members.length - 1; i++) {
                        mr.members[i] = mr.members[i + 1];
                    }
                    System.out.println(Arrays.toString(mr.members));
                    Member[] temp = new Member[mr.members.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = mr.members[i];
                    }
                    mr.members = temp;
                } else {
                    return;
                }
            }
        }
    } // end remove

    public void getMember() {
        String inputEmail = si.input("조회할 회원 이메일:");

        Member foundMember = mr.findMemberByEmail(inputEmail);
        if (foundMember != null) {

        } else {
            System.out.println("회원은 존재하지 않습니다.");
        }
    }

    public void updatePassword() {
        String inputEmail = si.input("조회할 회원 이메일:");
        Member foundMember = mr.findMemberByEmail(inputEmail);
        if (foundMember != null) {
            //비번 수정
            System.out.printf("# %s님의 비밀번호를 변경합니다.\n",foundMember.memberName);
            String newPassword = si.input("#새 비밀번호:");
            //실제 수정
            //foundMember.password = newPassword;
            foundMember.changePassword(newPassword);
        } else {
            System.out.println("회원이 존재하지 않습니다.");
        }

    }// end updatePassword

    public void deleteMember(){
        String inputEmail = si.input("# 삭제할 이메일 적기");
        Member foundMember = mr.findMemberByEmail(inputEmail);
        if(foundMember != null){
        //삭제 진행
        //패스워드 검사
        String inputPw = si.input("#비밀번호를 입력:");
        if(inputPw.equals(foundMember.password)){
            System.out.printf("# %s님의 회원정보가 삭제되었습니다.\n",foundMember.memberName);
            mr.backupMember(inputEmail);
            mr.removeMember(inputEmail);


        }else{
           System.out.println("비밀번호 틀림");
        }

        }else{
            System.out.println("회원이 존재하지 않음");
        }

    }

    //복구 ㄱ
    public void restoreMember() {
        String inputEmail = si.input("# 복구할 이메일 적기");
        int index = mr.findIndexRestore(inputEmail);
        if(index != -1){
            Member m = mr.findRestoreByEmail(inputEmail);
            String inputPw = si.input("#비밀번호를 입력:");
            if(inputPw.equals(m.password)) {
            //ㄱㄱㄱ
                System.out.println("# 회원 복구가 처리되었습니다.");
                mr.addNewMember(m);
            }
            else{
                System.out.println("패스워드 일치하지 않음.~!");
            }


                ///
        }
        else{
            System.out.println("# 복구할 이메일을 찾을수가 없네요");
        }


    }//end restore

}
