package day08.enum_2;

public enum TeamRole {

    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");


    // 이하를 작성하세요
    private String description;
//    private TeamRole role;
    
    TeamRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
