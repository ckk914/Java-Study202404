package day07.encap;

public class Car2 {
    private String model; //모델명
    private int speed;    // 현재속도
    private char mode;  //변속모드 D,N,R,P
    private boolean start; //시동이 걸린 여부

//    엔진에 연료가 주입되는 기능
    private void injectGasoline(){
        if(start) {
            System.out.println("엔진에 연료가 주입됩니다.");
        }
        else{
            System.out.println("시동이 켜지지 않았습니다.");
            System.out.println("자동차가 폭발합니다.");
        }
    }
    //엔진 오일이 순환하는 기능
    private void moveEngineOil(){
        System.out.println("엔진오일이 순환합니다.");
    }
    //엔진 내부에 있는 실린더가 작동하는 기능
    private void moveCylinder(){
        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
    }
    //엔진 내부에 있는
    public void startStop(){
        this.start = !this.start;
        if(start){
            System.out.println("시동이 켜졌습니다. 운행준비를 시작합니다.");
            injectGasoline();
            moveEngineOil();
            moveCylinder();
        }else{
            System.out.println("시동이 꺼졌습니다. 다음에 다시 만나요~");
        }
    }
    //생성자
    Car2(String model){
        this.model= model;
//        this.speed = 0; //int 기본값 0 이니 생략가능
        this.mode = 'P';     //파킹
//        this.start = false; //기본값 false 니 생략가능 꺼진상태
    }
    //범위 제한 메서드 제공
    //setter 메서드 : 필드값을 안전하게 설정하기 위한 검증 로직이 포함된 메서드
    public void setSpeed(int speed){
        if(speed<0 || speed> 200){
            this.speed = 0;
            this.start = false;
            this.mode = 'P';
            System.out.println("제한 속도 위반으로 시동이 꺼졌습니다.");
        }else {
            this.speed = speed;
        }
    }
    //현재 속도값을 가져오는 메서드
    //getter: 정보 은닉된 필드를 합법적으로 가져오는 대리 메서드

    public int getSpeed() {
        return speed;
    }

    //boolean필드의 getter는 이름 관례가 다름  is+ 필드명

    public boolean isStart() {
        return start;
    }

    public void setMode(char mode) {
//        if(mode =='P'||mode =='D'||mode =='R'||mode =='N') {
//            this.mode = mode;
//        }
//        else{
//            System.out.println("모드가 문제가 있습니다.주차모드(P)로 돌아갑니다.");
//        }
        switch (mode){
            case 'P': case 'N': case 'R': case 'D':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';

        }
    }

    public char getMode() {
        return mode;
    }
}
