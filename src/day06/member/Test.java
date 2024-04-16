package day06.member;

public class Test {
    public static void main(String[] args) {

        Member[] arr = new Member[5]; //멤버 배열

        Member m1 = new Member("abc@naver.com","1234","김철수","남자",5);
        Member m2 = new Member("abc@naver.com","1234","김돌","남자",5);

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = new Member("ad","D","D","d",11);

        System.out.println("m1.이름 = " + m1.memberName);
        System.out.println("m1 = " + m1);  //자동으로 toString 호출됨(주소찍힘)
        System.out.println("m2 = " + m2.toString());

        Member[] members = {m1,m2,new Member(),new Member()}; //생성 및 선언

        for(Member m:members){
            System.out.println( m);
        }
        System.out.println("================");
        MemberRepository mr = new MemberRepository();
        MemberView mv = new MemberView();
        Member add1 = new Member("ddd@ddd.com","4321","칼","남자",34);
        mr.addNewMember(add1);
        mv.showMembers();
    }
}
