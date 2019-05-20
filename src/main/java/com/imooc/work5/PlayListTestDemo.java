package com.imooc.work5;

import java.util.Scanner;

public class PlayListTestDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PlayListTestDemo td=new PlayListTestDemo();
        PlayList mainPlayList=new PlayList("主播放列表");
        PlayList playList=new PlayList("普通播放列表");
        PlayListCollection plc=new PlayListCollection();
        plc.addPlayList(mainPlayList);
        int i;
        do {
            td.mainMenu();
            i=sc.nextInt();
            switch(i){
                case 1:
                    int case1;
                    do{
                        td.playListMenu();
                        case1=sc.nextInt();
                    switch (case1){
                        case 1:
                            System.out.println("请输入要添加的歌曲数量：");
                            int songNum=sc.nextInt();
                            for (int j = 0; j <songNum ; j++) {
                                System.out.println("请输入第"+(j+1)+"首歌曲");
                                System.out.println("请输入要添加的歌曲ID：");
                                String id=sc.next();
                                if(mainPlayList.searchSongById(id)!=null){
                                    System.out.println("已添加成功！");
                                    continue;
                                }
                                System.out.println("请输入要添加的歌曲名称：");
                                String name=sc.next();
                                System.out.println("请输入要添加的演唱者：");
                                String singer=sc.next();
                                Song song=new Song(id,name,singer);
                                mainPlayList.addToPlayList(song);
                                System.out.println(song);
                            }
                            break;
                        case 2:
                            System.out.println("请输入播放列表名称：");
                            String playListName=sc.next();
                            if(!plc.getPlayListMap().containsKey(playListName)){
                                System.out.println("输入的播放列表不存在，请到播放器管理添加！");
                            }
                            System.out.println("请输入要添加的歌曲数量：");
                            int num=sc.nextInt();
                            for (int k = 0; k <num ; k++) {
                                System.out.println("请输入第"+(k+1)+"首歌曲");
                                System.out.println("请输入要添加的歌曲ID：");
                                String id=sc.next();
                                Song song;
                                if (playList.searchSongById(id)!=null){
                                    System.out.println("当前歌曲已存在！");
                                    continue;
                                }
                                if(mainPlayList.searchSongById(id)!=null){
                                    song=mainPlayList.searchSongById(id);
                                    plc.getPlayListMap().get(playListName).addToPlayList(song);
                                    System.out.println("已添加成功！");
                                    continue;
                                }
                                System.out.println("请输入要添加的歌曲名称：");
                                String name=sc.next();
                                System.out.println("请输入要添加的演唱者：");
                                String singer=sc.next();
                                song=new Song(id,name,singer);
                                playList.addToPlayList(song);
                                System.out.println(song);
                            }
                            break;
                        case 3:
                            System.out.println("请输入播放列表名称");
                            playListName=sc.next();
                            System.out.println("请输入歌曲id：");
                            String id=sc.next();
                            if(!plc.getPlayListMap().containsKey(playListName)){
                                System.out.println("该播放列表不存在");
                            }
                            if(playListName.equals("主播放列表")){
                                System.out.println(mainPlayList.searchSongById(id));
                            }
                            System.out.println(playList.searchSongById(id));
                            break;
                        case 4:
                            System.out.println("请输入播放列表名称");
                            playListName=sc.next();
                            System.out.println("请输入歌曲id：");
                            String name = sc.next();
                            if(!plc.getPlayListMap().containsKey(playListName)){
                                System.out.println("该播放列表不存在");
                            }
                            if(playListName.equals("主播放列表")){
                                System.out.println(mainPlayList.searchSongByName(name));
                            }
                            System.out.println(playList.searchSongByName(name));
                            break;
                        case 5:
                            System.out.println("修改播放列表中的歌曲");
                            System.out.println("请输入要修改的歌曲id：");
                            id=sc.next();
                            System.out.println("请输入修改后的歌曲名称：");
                            name=sc.next();
                            System.out.println("请输入修改后的演唱者：");
                            String singer=sc.next();
                            Song tempSong=new Song(id,name,singer);
                            playList.updateSong(id,tempSong);
                            break;
                        case 6:
                            break;
                        case 7:
                            mainPlayList.displayAllSong();
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                            default:
                                System.out.println("输入错误");
                    }
                    }while(case1!=9);

                    break;
                case 2:
                    int case2;
                    do {
                    td.playerMenu();
                    case2=sc.nextInt();
                        String playListName;
                    switch (case2){
                        case 1:
                            System.out.println("请输入播放器列表名称：");
                            playListName=sc.next();
                            playList.setPlayListName(playListName);

                            plc.addPlayList(playList);
                            break;
                        case 2:
                            System.out.println("请输入播放器列表名称：");
                            playListName=sc.next();
                            if(playListName.equals("主播放列表"))
                                plc.deletePlayList(mainPlayList);
                            else if(playListName.equals(playListName))
                                plc.deletePlayList(playList);
                            else
                                System.out.println("输入的播放器列表不存在");
                            plc.displayPlayListName();

                            break;
                        case 3:
                            System.out.println("请输入播放器列表名称：");
                            playListName=sc.next();
                            System.out.println(plc.searchPlayListByName(playListName));
                            break;
                        case 4:
                            plc.displayPlayListName();
                            break;
                        case 9:
                            System.out.println("返回上级菜单");
                            break;
                    }
                    }
                    while (case2!=9);
                case 0:
                    System.out.println("退出程序");
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
            }

        }while(i!=0);


    }
    public void mainMenu(){
        System.out.println("**********************");
        System.out.println("1--播放器列表管理");
        System.out.println("2--播放器管理");
        System.out.println("0--退出");
        System.out.println("**********************");
        System.out.println("请输入对应数字进行操作：");
    }
    public void playListMenu(){
        System.out.println("*******************************");
        System.out.println("  ****播放列表管理****");
        System.out.println("  1--播将歌曲添加到主播放列表");
        System.out.println("  2--播将歌曲添加到普通播放列表");
        System.out.println("  3--通过歌曲id查询播放列表中的歌曲");
        System.out.println("  4--通过歌曲名称查询播放列表中的歌曲");
        System.out.println("  5--修改播放列表中的歌曲");
        System.out.println("  6--删除播放列表中的歌曲");
        System.out.println("  7--显示播放列表中的所有歌曲");
        System.out.println("  8--导出歌单");
        System.out.println("  9--返回上一级菜单");
        System.out.println("*******************************");
        System.out.println("请输入对应数字对播放列表进行管理：");
    }
    public void playerMenu(){
        System.out.println("*******************************");
        System.out.println("  ****播放器管理****");
        System.out.println("  1--向播放器添加播放列表");
        System.out.println("  2--从播放器删除播放列表");
        System.out.println("  3--通过名字查询播放列表信息");
        System.out.println("  4--显示所有播放列表名称");
        System.out.println("  9--返回上一级菜单");
        System.out.println("*******************************");
        System.out.println("请输入对应数字对播放列表进行管理：");
    }
    public void test(){
    }
}
