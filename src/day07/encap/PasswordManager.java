package day07.encap;

import java.util.Scanner;

public class PasswordManager {
//            - 비밀번호(password) 필드는 private으로 선언하고, 비밀번호를 설정하고 변경할 수 있는 메소드를 public으로 만드세요.
    private String password;

    PasswordManager(String password){
        this.password = password;
    }

    //비밀번호 변경

    /**
     * 비밀번호를 변경해주는 공개된 메서드
     * 사용자는 기존에 사용하던 패스워드를 전달
     * @param oldPassword
     * @param newPassword
     * @return
     */
    public boolean changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password)){
            //변경 진행
            this.password = newPassword;
            return true;
        }
        else{
            System.out.println("입력된 비밀번호가 기존 비밀번호와 다릅니다.!");
            return false;
        }
    }
//            - 비밀번호 변경 시 현재 비밀번호를 입력받아야만 변경 가능하도록 구현하세요.

}
