package day06.member;
//역할: 회원 데이터 관리를 위해 입력 출력을 담당함
public class MemberView {

    //객체의 협력
    MemberRepository mr;

    MemberView() {
        this.mr = new MemberRepository();
    }

    //메서드
    // 모든 회원의 정보를 출력하는 기능
    void showMembers() {
        System.out.printf("===현재 회원 목록 (총 %d명)======\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }
}
