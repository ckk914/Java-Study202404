package day06.member;

import java.util.Arrays;

//회원 배열을 관리하는 역할 = 회원 데이터 저장소
public class MemberRepository {
    //필드
    static Member[] members; //static 안하면 add 안됨! static 붙이기!

    //생성자
    MemberRepository() {
        this.members = new Member[3]; //빈걸로 시작
        members[0] = new Member("A@C.COM", "1234", "콩순이", "여성", 40);
        members[1] = new Member("A@C.COM", "5678", "팥", "여성", 40);
        members[2] = new Member("A@C.COM", "0000", "콩", "여성", 40);
    }
    //메서드

    /**
     * 생성된 회원 정보를 회원배열에 끝에 추가하는 기능
     *
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */

    //회원 정보 생성
    //입력 받은 것 객체로 가져오면
    // 배열로 저장해줄거다.. 라는 함수
    // 배열에 데이터 추가하는 로직
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
}
