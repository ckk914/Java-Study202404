package day08.enum_2;

public class TeamMember {
    //     - 속성:
//            - `name` (팀원 이름, 문자열)
//            - `role` (팀원의 역할, `TeamRole`)
//            - 메소드:
//            - 생성자: `name`과 `role`을 매개변수로 받아 초기화합니다.
//            - `assignTask()`: 팀원의 역할에 따라 적절한 작업을 출력하는 메소드.
//            예를 들어, `DEVELOPER`에게는 "Developing features"를 할당합니다.
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        // 이하를 작성하세요
        System.out.printf("%s is assigned to %s\n",
                this.name, this.role.getDescription());
    }


}
