package day11.song;

import day07.modi.pac1.A;

import java.util.Scanner;

public class ArtistView {
    private static ArtistRepository repository = new ArtistRepository();  //저장, 가져오기 역할

    static Scanner sc = new Scanner(System.in);
    //프로그램 실행
    public static void start(){
        while (true) {
            System.out.println("****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", ArtistRepository.MapSize());
            System.out.println("# 1. 노래 등록하기 # ");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("=============================");
            System.out.print(">> ");
            int menuNum = Integer.parseInt(sc.nextLine());
            System.out.println(menuNum);

            switch (menuNum) {
                case 1:
                    //등록
                    ArtistRepository.addMap();
//                    ArtistRepository.insert();
                    break;
                case 2:
                    //검색
                    ArtistRepository.MapSearch();

                    break;
                case 3:
                    System.out.println("종료합니다");
                    System.exit(0);
                    //종료
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택했어요");
                    break;

            }
        }
    }

}
