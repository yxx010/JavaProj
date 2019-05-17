package com.imooc.work5;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String playListName;
    List <Song> musicList=new ArrayList<Song>();
    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    //添加歌曲到播放器列表
    public void addToPlayList(Song song){
        musicList.add(song);
    }

    //显示播放列表中所有歌曲：
    public void displayAllSong(){
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println(musicList.get(i));
        }

    }

    //    	－通过id查询歌曲：
    public Song searchSongById(String id){
        Song song=null;
        for (int i = 0; i <musicList.size() ; i++) {
            if(musicList.get(i).getId()==id)
                song=musicList.get(i);
        }
        return song;
    }
    //    	－通过名称查询歌曲：
    public Song searchSongByName(String n){
        Song song=null;
        for (int i = 0; i < musicList.size(); i++) {
            if(musicList.get(i).getName().equals(n))
                song=musicList.get(i);
        }
        return song;
    }

    //    	－修改歌曲：
    public void updateSong(String id,Song song){
        Song s=searchSongById(id);
        musicList.remove(s);
        s=song;
        musicList.add(song);
    }

    //    	－从播放列表删除歌曲：
    public void deleteSong(String id){
        Song song=searchSongById(id);
        musicList.remove(song);
    }

    //             - 导出歌单 ：
    public void exportPlayList(){

    }
}
