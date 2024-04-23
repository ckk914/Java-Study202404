package day11.song;

import day07.modi.pac1.A;
import day09.poly.car.Sonata;

import java.util.*;

//가수 객체 여러개를 관리(조회, 수정, 삭제, 생성, 탐색,정렬 ...)
public class ArtistRepository {

    //가수들을 담은 자료구조 선언
    //key : 가수 이름, value : 가수 객체(가수명, 노래 리스트)
    private static Map<String, Artist> map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);


    //가수 정보 생성
    public static void addMap() {
//        Artist artist = new Artist();

//        Set<String> addList = songList;
        boolean isNew = false;

        System.out.println("# 노래 등록을 시작합니다.");
        System.out.printf("- 가수명: ");
        String ArtistName = sc.nextLine();
//        artist.setArtistName(ArtistName);


        System.out.printf("- 노래명: ");
        String input = sc.nextLine();

//        Set<String> songName = new HashSet<>(Arrays.asList(input.split(" ")));
        String songName = input;
//        artist.setSongList(songName);
        System.out.println(map);

//        isNew = map.containsKey(ArtistName);  //신규 체크
        isNew = ArtistRepository.isRegistered(ArtistName);
        System.out.println(isNew);
        if (!isNew) {
//            map.put(ArtistName, artist);          //맵에 추가
            ArtistRepository.addNewArtist(ArtistName, songName);
            System.out.printf("%s님이 신규 등록되었습니다.\n", ArtistName);
        } else {
            //새로운 노래를 추가해본다..
            //추가가 잘되었는지 여부를 확인한다.
            boolean flag = ArtistRepository.addNewSong(ArtistName, songName);

            if (flag) { // 기존 가수의 트랙리스트에 노래만 추가하는 경우
                System.out.printf("\n# %s님이 노래목록에 %s곡이 추가되었습니다.\n", ArtistName, songName);
            } else { // 노래가 중복된 경우
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
            }
            //
        }

    }

    private static boolean addNewSong(String artistName, String songName) {
        //맵에서 기존 가수 정보를 가져오기!
        Artist foundArtist = map.get(artistName);
        return foundArtist.addSong(songName); //정상 추가되면 true
    }

    private static void addNewArtist(String artistName, String songName) {
        //주어진 정보를 맵에 저장
        Artist newArtist = new Artist(artistName);
        //첫번째 노래 songList 에 추가
        newArtist.addSong(songName);

        map.put(artistName, newArtist);
//        map.put(artistName,new Artist(artistName,))

    }


    //맵 사이즈 표시
    public static int MapSize() {
        return map.size();
    }

    public static void MapView(String Search) {
        for (String s : map.keySet()) {
            if (s.equals(Search)) {
                System.out.println("출력" + Search);
                System.out.println("key = " + s);
                System.out.println("Value = " + map.get(s));
                break;
            }

        }
    }

    public static void MapSearch() {
        System.out.println("## 검색 코너 ##");
        System.out.printf("# - 가수명: ");
        String s = sc.nextLine();
//        ArtistRepository.MapView(s);
        //검색한 가수가 저장되어 있다면
        if(ArtistRepository.isRegistered(s)){
            //등록된 노래 뿌린다
            Set<String> songList = ArtistRepository.getSongList(s);
            //ㄴ [1, 2]
            System.out.printf("\n# %s님의 노래 목록\n",s);
            System.out.println("========================");
            int num =1;
            for (String song: songList){
                System.out.printf("#. %d.  %s\n",num++,song);
                System.out.println("======================");
            }
        }
        else{
            System.out.println("해당 가수는 없어요~");
        }
    }

    private static Set<String> getSongList(String s) {
        //get 맵의 데이터를 가져온다~!
        Artist foundArtist = map.get(s);
//        foundArtist = Artist{artistName='11', songList=[11, 111]}
        return foundArtist.getSongList();
        
    }

    public static boolean isRegistered(String artistName) {
        return map.containsKey(artistName);
    }

}
