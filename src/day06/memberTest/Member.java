package day06.memberTest;

public class   Member {
    String email;
    String memberName;
    String password;
    String gender;
    int age;

    Member(String email,String memberName,String password,String gender, int age){
        this.email = email;
        this.memberName = memberName;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }
    // 객체만 출력하면 나오는 정보임.!⭐
    public String toString() {
        return String.format("# 이름: %s, 이메일: %s, 나이: %d세, 성별: %s"
                , this.memberName, this.email, this.age, this.gender);
    }

    // 회원의 비밀번호를 수정하는 메서드 (정석적인 위치임...좀 과한ㄷ?)
    void changePassword(String newPassword){
        this.password = newPassword;
    }
}
