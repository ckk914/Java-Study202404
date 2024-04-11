package day04;

public class Dog {

    //필드 정의 : 객체 속성
    String dogName;
    int age;
    boolean injection; //예방접종 유무
    //매서드 정의 : 객체 기능
    void petInfo(){
        System.out.printf("우리집 강아지는 %s에요! %d살이예요\n",dogName,age);
        if(injection){
            System.out.println("예방접종했어요");
        }
        else{
            System.out.println("아직 예방접종을 안했어요~!");
        }
    }
    void inject(){
        System.out.printf("%s 강아지에게 주사를 맞혀요\n",dogName);
        injection=true;
    }
//생성자
    Dog(){
        System.out.println("1번생성자 호출");
    }
    Dog(String dName){
        System.out.println("2번생성자 호출");
        dogName = dName;
        age = 1;
    }

}
