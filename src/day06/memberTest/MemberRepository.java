package day06.memberTest;

import day06.memberTest.Member;

import java.util.Arrays;

public class MemberRepository {
    //멤버 목록
    static Member[] members; //static 안하면 add 안됨! static 붙이기!
    static Member[] restoreList; // 백업용 - 삭제 녀석들
    //생성자
    MemberRepository(){
        this.members = new Member[0]; //빈걸로 시작
        this.restoreList = new Member[0];
    }
    //메서드
    //멤버 추가
    void addNewMember(Member newMember) {
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
//            System.out.println(Arrays.toString(temp));
        members = temp;
    }
    /**
     * 이메일 중복 체크
     *
     * @param targetEmail - 검사할 사용자의 입력 이메일
     * @return - 이메일이 이미 존재한다면 true,
     * 존재하지 않는 사용 불가 이메일이면 false
     * @author - 코딩킹
     * @since - 2024.04.16
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    public Member findMemberByEmail(String inputEmail){
        for(Member m: members){
            if(inputEmail.equals(m.email)){
                return m;
            }
        }
        return null;
    } //end find

    public Member findRestoreByEmail(String inputEmail){
        for(Member m: restoreList){
            if(inputEmail.equals(m.email)){
                return m;
            }
        }
        return null;
    } //end find

    //멤버 index 탐색
    int findIndex(String email){
        for (int i = 0; i < members.length ; i++) {
            if(email.equals(members[i].email)) {
                return i;
            }
        }
        return -1;
    }

    int findIndexRestore(String email){
        for (int i = 0; i < restoreList.length ; i++) {
            if(email.equals(restoreList[i].email)) {
                return i;
            }
        }
        return -1;
    }

    //배열 회원정보 삭제
    public void removeMember(String inputEmail) {
        int index = findIndex(inputEmail);

        if(index == -1) return;

        for (int i = index; i < members.length-1 ; i++) {
            members[i] = members[i+1];
        }
        Member[] temp = new Member[members.length-1];
        for(int i = 0; i< temp.length;i++){
            temp[i] = members[i];
        }
        members = temp;

    }

    public void backupMember(String inputEmail) {
        int index = findIndex(inputEmail);
//        System.out.println(index);
        System.out.println(restoreList.length);
        Member[] temp = new Member[restoreList.length + 1];
        if(index != -1) {
            for (int i = 0; i < temp.length-1; i++) {
                System.out.println(i);
                temp[i] = restoreList[i];}

            temp[temp.length - 1] = members[index];
//            System.out.println(Arrays.toString(temp));
            restoreList = temp;

            System.out.println("restoreList = " + Arrays.toString(restoreList));
        }
        else{
            System.out.println("찾아봤는데, 없음");
        }
    }
}
