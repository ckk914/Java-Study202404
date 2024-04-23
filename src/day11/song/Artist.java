package day11.song;

import java.util.HashSet;
import java.util.Set;

public class Artist {
    private String artistName; //가수명
    private Set<String> songList; //노래목록 , 중복 허용 안함 ,순서 상관없음!
                                  //순서 중요하면 List 쓰시오
    //생성자


    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>();  //빈걸로 시작해야함!!⭐️
                                          //비어있는 set
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Set<String> getSongList() {
        return this.songList;      // [1, 12]
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    public boolean addSong(String songName) {
       return this.songList.add(songName);

    }
    //setter, getter
    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
