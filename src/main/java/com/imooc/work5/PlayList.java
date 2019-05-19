package com.imooc.work5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {
    private String playListName;
    List <Song> musicList=new ArrayList<Song>();
    public PlayList(){

    }
    public PlayList(String playListName){
        this.setPlayListName(playListName);
    }
    public PlayList(String playListName,List <Song>musicList){
        this.setPlayListName(playListName);
        this.setMusicList(musicList);
    }
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
            if(musicList.get(i).getId().equals(id))
                song= musicList.get(i);
            break;
        }
        return song;
    }
    //    	－通过名称查询歌曲：
    public Song searchSongByName(String n){
        Song song=null;
        for (int i = 0; i < musicList.size(); i++) {
            if(musicList.get(i).getName().equals(n))
                song=musicList.get(i);
            break;
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

    //             - 导出歌单 ：序列化
    public void exportPlayList(){

    }

    @Override
    public String toString() {
        return "该播放列表名称为："+this.getPlayListName()
                +"\n播放列表所有歌曲为："+musicList;
    }
}