package com.imooc.work5;

import java.util.Iterator;
import java.util.Map;

public class PlayListCollection {

    private static Map<String,PlayList >playListMap;

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
        return playListMap.get(playListName);
    }
    public void displayPlayListName(){
        Iterator<PlayList> it = playListMap.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            }
        }

    }


