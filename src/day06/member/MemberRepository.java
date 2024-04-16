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
        //회원 정보 생성
        //입력 받은 것 객체로 가져오면
        // 배열로 저장해줄거다.. 라는 함수
        // 배열에 데이터 추가하는 로직
        void addNewMember(Member newMember){
        Member[] temp = new Member[members.length+1];
            for (int i = 0; i <members.length ; i++) {
                temp[i] = members[i];
            }
            temp[temp.length-1] = newMember;
//            System.out.println(Arrays.toString(temp));
            members = temp;
        }

}
