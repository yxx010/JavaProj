package com.imooc.work5;

import java.util.*;

//播放器类
public class PlayListCollection {
    Scanner scanner;

    private static Map<String,PlayList >playListMap=new HashMap<>();

    public static Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public static void setPlayListMap(Map<String, PlayList> playListMap) {
        PlayListCollection.playListMap = playListMap;
    }

    public void addPlayList(PlayList playList){
        playListMap.put(playList.getPlayListName(),playList);
    }
    public void deletePlayList(PlayList playList){
        playListMap.remove(playList.getPlayListName());
    }
    public PlayList searchPlayListByName(String playListName){
        if(!playListMap.keySet().contains(playListName)){
            System.out.println("该播放列表不存在！");
        }
        System.out.println("该播放列表存在！");
        return playListMap.get(playListName);
    }
    public void displayPlayListName(){
        Iterator<PlayList> it = playListMap.values().iterator();
        if(playListMap.size()==0){
            System.out.println("暂无播放列表！");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
            }
        }


    }


